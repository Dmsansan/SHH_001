package com.sansan.ssh.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.sansan.ssh.dao.UserDao;
import com.sansan.ssh.model.User;

public class UserDaoImpl implements UserDao{
	//Spring×¢ÈëSessionFactory
	private SessionFactory sessionFactory;
	
	@Override
	public void saveObject(Object object) throws HibernateException {
		// TODO Auto-generated method stub
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserInfo() {
		System.out.print("+++++++"+"UserDaoImpl"+"\n");
		 String hql = "FROM User";
	     return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	

}
