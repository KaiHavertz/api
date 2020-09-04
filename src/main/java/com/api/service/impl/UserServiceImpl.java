package com.api.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.User;
import com.api.mapper.UserDao;
import com.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUserList() {
		System.out.println("部门:"+userDao.selectList(null));
		List<User> userList = new ArrayList<User>();
		User user = null;
		for (int i = 1; i <= 100; i++) {
			user = new User();
			user.setUserDepartment(1+i);
			user.setUserAge(1*i);
			user.setName("部门:"+(int)(Math.random()*100));
			user.setUserId(i*10);
			user.setUserAge(i+10);
			user.setUserSex((int)(Math.random()*2)+1);
			user.setVersion(1);
			user.setUserBirthday(new Date());
			user.setUserName("个人名称:"+(int)(Math.random()*100));
			userList.add(user);
		}
		return userList;
	}

}
