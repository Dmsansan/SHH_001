package com.sansan.ssh.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private UserServcie userService;
	
	private Map<String, Object> model;
	
	public String excute() throws Exception{
		return SUCCESS;
	}
	
	/**
	 * Ìø×ª×¢²áÒ³Ãæ
	 * @return
	 */
	public String register(){
		return "register";
	}
	
	public String login(){
		model  = new HashMap<String,Object>();
		model.put("key", "13123");
		return Action.SUCCESS;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
}
