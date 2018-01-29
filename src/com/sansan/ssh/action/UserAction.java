package com.sansan.ssh.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.sansan.ssh.model.User;
import com.sansan.ssh.service.UserService;


public class UserAction extends ActionSupport{
	/**
	 *���к�ID������JVM����ʱ�İ汾��Ӧ������������¿��ԶԱ�ѧ����ID�Ƿ�һ���жϷ�������� 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	private Map<String, Object> model;
	
	public String excute() throws Exception{
		return SUCCESS;
	}
	
	/**
	 * ��תע��ҳ��
	 * @return
	 */
	public String register(){
		return "register";
	}
	
	/**
	 * ����json���ݲ���
	 * @return
	 */
	public String login(){
		model  = new HashMap<String,Object>();
		model.put("key", "13123");
		return Action.SUCCESS;
	}
	
	
	public String findUser(){
		System.out.print("+++++++"+"UserAction"+"\n");
		model= new HashMap<String,Object>();
//		userService.getUserInfo();
//		return NONE;
		List<User> user = userService.getUserInfo();
		model.put("data",user);
		return Action.SUCCESS;
	}
	
	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
//
//	public UserService getUserService() {
//		return userService;
//	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}
