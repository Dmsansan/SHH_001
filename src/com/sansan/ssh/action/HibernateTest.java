package com.sansan.ssh.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.sansan.ssh.model.User;

public class HibernateTest {

	@Test
	public void test() {
		 // 获取 Hibernate 配置信息
        Configuration configuration = new Configuration().configure();
        //@SuppressWarnings("deprecation")
        // 根据 configuration 建立 sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // 开启 session（相当于开启 JDBC 的 connection）
        Session session = sessionFactory.openSession();

        // 创建并开启事务对象
        session.beginTransaction();
        // 新建对象，并赋值
        User user = new User();
        //user.setUserID(1);
        user.setUserName("admin");
        user.setPassWord("admin");

        // 保存对象
        session.save(user);

        // 提交事务
        session.getTransaction().commit();

        // 关闭 session 和 sessionFactory
        session.close();
        sessionFactory.close();
	}

}
