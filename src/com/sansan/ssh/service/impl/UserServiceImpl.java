package com.sansan.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sansan.ssh.dao.UserDao;
import com.sansan.ssh.model.User;
import com.sansan.ssh.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUserInfo() {
		System.out.print("+++++++"+"UserServiceImpl"+"\n");
		return userDao.getUserInfo();
	}

}
