package com.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.api.utils.ResponseResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@Controller
@RequestMapping("kugou")
public class KuGouController {
	@ResponseBody
	@RequestMapping("receive")
	public ResponseResult<Void> receive(@RequestParam("msg") String msg) {
		ResponseResult<Void> rr = new ResponseResult<Void>();
		rr.setCode(200);
		rr.setMsg(msg);

		return rr;
	}
	
	@RequestMapping(value = "accept")
	public @ResponseBody ResponseResult<Void> accept(@RequestParam("msg") String msg,@RequestParam("type") String type,HttpSession session) throws JsonMappingException, JsonProcessingException {
		System.out.println("type-"+type+"==   "+msg);
        ResponseResult<Void> rr = new ResponseResult<Void>();
		rr.setCode(200);
		rr.setMsg("成功");
        return rr;
		
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("api")
	public String accept(HttpSession session,Model model)  {
		List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
		for (int i = 1; i <= 5; i++) {
			listmap.add((Map<String, Object>) session.getAttribute("type-"+i));
		}
		model.addAttribute("listmap",listmap);
		return "api.html";
	}
	
	
	@ApiOperation("获取部门列表信息")
	@RequestMapping(value = "setCache", method = RequestMethod.POST)
	@ApiImplicitParam(name = "department", value = "用户登录表单", required = true, dataType = "Department")
	public ResponseResult<Void> setCache(){
		return null;
		
	}
}
