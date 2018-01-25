package com.sansan.ssh.dao;

import org.hibernate.Session;

import org.hibernate.HibernateException;

/**
 * 接口基类
 * @author Administrator
 *
 */
public interface BaseDao {
	
	public void saveObject(Object object) throws HibernateException;
	
	public Session getSession();
	
	public void setSession(Session session);
}
