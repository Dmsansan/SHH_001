package com.sansan.ssh.dao;

import java.util.List;

import com.sansan.ssh.model.User;

public interface UserDao extends BaseDao{

	List<User> getUserInfo();
	
}
