package com.sansan.ssh.dao;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;

/**
 * �ӿڻ���
 * @author Administrator
 *
 */
public interface BaseDao {
	
	public void saveObject(Object object) throws HibernateException;
	
	public SessionFactory getSessionFactory();
	
	public void setSessionFactory(SessionFactory sessionFactory);
}
