package com.sansan.ssh.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.sansan.ssh.model.User;

public class HibernateTest {

	@Test
	public void test() {
		 // ��ȡ Hibernate ������Ϣ
        Configuration configuration = new Configuration().configure();
        //@SuppressWarnings("deprecation")
        // ���� configuration ���� sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // ���� session���൱�ڿ��� JDBC �� connection��
        Session session = sessionFactory.openSession();

        // �����������������
        session.beginTransaction();
        // �½����󣬲���ֵ
        User user = new User();
        //user.setUserID(1);
        user.setUserName("admin");
        user.setPassWord("admin");

        // �������
        session.save(user);

        // �ύ����
        session.getTransaction().commit();

        // �ر� session �� sessionFactory
        session.close();
        sessionFactory.close();
	}

}
