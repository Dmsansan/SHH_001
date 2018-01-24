package com.sansan.ssh.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 
 * @author sansan
 *
 */
@Entity
@Table(name = "student")
public class User implements Serializable
{
    private static final long serialVersionUID = 2313421496945642L;

    private int userID;

    private String userName;

    private String passWord;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}




}
