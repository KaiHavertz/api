package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.User;
import com.api.service.UserService;
import com.api.utils.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("用户 user 接口")
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "getUserList", method = RequestMethod.GET)
	@ApiOperation(value = "获取用户列表信息", notes = "所有用户")
	public ResponseResult<List<User>> getUserList() {
		ResponseResult<List<User>> rr = new ResponseResult<List<User>>();
		rr.setCode(200);
		rr.setMsg("成功");
		rr.setData(userService.getUserList());
		return rr;
	}

}
