package com.api.controller;

import java.io.IOException;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.dubbo.config.annotation.Reference;
import com.api.doman.Image;
import com.api.utils.ResponseResult;
import com.jnr.service.DubboUploadService;
import com.jnr.service.TestService;

/**
 * 处理图片上传服务
 * 
 * @author JNR
 * @date 2020年10月1日
 * @time 下午5:32:47
 */
@RequestMapping("image")
@RestController
public class ImageController {
	@Reference
	private DubboUploadService uploadService;

	@Reference
	private TestService testService;

	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public ResponseResult<Image> upload(@RequestParam("file") MultipartFile file) throws Exception {

		System.out.println("-----------------------");

		System.out.println(uploadService == null);
		ResponseResult<Image> rr = new ResponseResult<Image>();
		Map<String, Object> result = uploadService.uploadImage(file.getContentType(), file.getOriginalFilename(),
				file.getSize(), file.getBytes());
		System.out.println(result);
		System.out.println("-----------------------");
		// 上传到云服务器的 fastdfs 文件服务器
		/*
		 * String fileName = file.getOriginalFilename();// 获取文件名 上传到本地 String filepath =
		 * "C:\\Users\\ASUS\\Pictures\\逍遥安卓照片"; if (!file.isEmpty()) { try
		 * (BufferedOutputStream out = new BufferedOutputStream( new
		 * FileOutputStream(new File(filepath + File.separator + fileName +"."+
		 * parseImageType(fileName))))) { out.write(file.getBytes()); out.flush(); } }
		 */
		rr.setCode(20000);

		rr.setData(new Image(1, result.get("filePath").toString()));
		rr.setMsg("成功上传");
		return rr;
	}

	public String parseImageType(String filename) throws IOException {
		if (filename != null) {
			if (filename.lastIndexOf(".png") > 0) {
				return "png";
			} else if (filename.lastIndexOf(".PNG") > 0) {
				return "PNG";
			} else if (filename.lastIndexOf(".jpg") > 0) {
				return "jpg";
			} else if (filename.lastIndexOf(".JPG") > 0) {
				return "JPG";
			} else if (filename.lastIndexOf(".gif") > 0) {
				return "gif";
			} else if (filename.lastIndexOf(".GIF") > 0) {
				return "GIF";
			}
		}
		return "png";
	}

}
