package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.IUserDao;
import com.dao.IUsersDao;
import com.pojo.User;

public class Test {

	public static void main(String[] args) throws Exception {
		//��ȡmybatis���������ļ�
		InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
		//����session�������쳧����
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//���ݶ�ȡ����������Ϣ�����쳧���˴���һ��session����
		SqlSessionFactory sessionFactiry = builder.build(input);
		//�õ�session����
		SqlSession session = sessionFactiry.openSession();
		/*
		IUserDao iUserDao = session.getMapper(IUserDao.class);
		
		User user = iUserDao.selectAllUser();
	
		System.out.println(user);*/
//		IUsersDao iUsersDao = session.getMapper(IUsersDao.class);
//		List<User> list = iUsersDao.listUsers();
//		for(User u : list) {
//			System.out.println(u);
//		}
		//���
//		User user = new User("С��",20,5000);
//		IUserDao iUserDao = session.getMapper(IUserDao.class);
//		iUserDao.insertUser(user);
//		session.commit();
//		session.close();
		//ɾ��
//		User user1 = new User("С��",20);
//		IUserDao iUserDao1 = session.getMapper(IUserDao.class);
//		iUserDao1.DeleteUser(user1);
//		session.commit();
//		session.close();
		//����
		
	
	}
}
