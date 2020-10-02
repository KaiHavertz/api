package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.doman.Role;
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
		rr.setCode(20000);
		rr.setMsg("成功");
		rr.setData(userService.getUserList());
		return rr;
	}
	

	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	@ApiOperation(value = "登录", notes = "登录")
	public ResponseResult<User> login(@RequestParam ("username")String username,@RequestParam ("password")String password) {
		ResponseResult<User> rr = new ResponseResult<User>();
		rr.setCode(20000);
		System.out.println("登录");
		System.out.println(username+"   "+password);
		rr.setMsg("成功");
		rr.setToken("mytoken");
		User user = new User();
		user.setUserName(username);
		rr.setData(user);
		return rr;
	}
	@RequestMapping(value = "getInfo", method = RequestMethod.POST)
	@ApiOperation(value = "登录", notes = "登录")
	public ResponseResult<Role> getInfo(@RequestParam ("token")String token) {
		ResponseResult<Role> rr = new ResponseResult<Role>();
		rr.setCode(20000);
		System.out.println("getInfo");
		Role role = new Role();
		System.out.println(token);
		role.setAvatar("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3815981154,1622516361&fm=26&gp=0.jpg");
		role.setIntroduction("incroduction");
		role.setName("username");
		role.setRoles(new String[] {"admin","role2"});
		rr.setMsg("成功");
		rr.setData(role);
		return rr;
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.POST)
	@ApiOperation(value = "登录", notes = "登录")
	public ResponseResult<Void> logout() {
		ResponseResult<Void> rr = new ResponseResult<Void>();
		rr.setCode(20000);
		rr.setMsg("成功");
		return rr;
	}
}
