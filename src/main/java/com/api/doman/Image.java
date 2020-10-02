package com.api.doman;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回上传的图片信息
 * @author JNR
 * @date 2020年10月1日
 * @time 下午5:33:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer imageId;
	private String imageUrl;

}
