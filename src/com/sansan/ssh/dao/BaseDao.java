package com.sansan.ssh.dao;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;

/**
 * 接口基类
 * @author Administrator
 *
 */
public interface BaseDao {
	
	public void saveObject(Object object) throws HibernateException;
	
	public SessionFactory getSessionFactory();
	
	public void setSessionFactory(SessionFactory sessionFactory);
}
