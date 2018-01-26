package com.sansan.ssh.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.sansan.ssh.model.User;
import com.sansan.ssh.service.UserService;


public class UserAction extends ActionSupport{
	/**
	 *序列号ID，用于JVM编译时的版本对应，反编译情况下可以对比学历好ID是否一致判断反编译情况 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	private Map<String, Object> model;
	
	public String excute() throws Exception{
		return SUCCESS;
	}
	
	/**
	 * 跳转注册页面
	 * @return
	 */
	public String register(){
		return "register";
	}
	
	/**
	 * 返回json数据测试
	 * @return
	 */
	public String login(){
		model  = new HashMap<String,Object>();
		model.put("key", "13123");
		return Action.SUCCESS;
	}
	public String findUser(){
		System.out.print("+++++++"+"UserAction"+"\n");
		userService.getUserInfo();
		return NONE;
//		List<User> user = userService.getUserInfo();
//		model.put("data", user);
//		return Action.SUCCESS;
	}
	
	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
	
	
	public UserService getUserService() {
		   return userService;
	}
		  
	public void setUserService(UserService userService) {
		          this.userService = userService;
    }
	
}
