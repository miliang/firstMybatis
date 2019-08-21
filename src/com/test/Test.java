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
		//读取mybatis的主配置文件
		InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建session工厂的造厂工人
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//根据读取到的配置信息，让造厂工人创造一个session工厂
		SqlSessionFactory sessionFactiry = builder.build(input);
		//得到session对象
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
		//添加
//		User user = new User("小张",20,5000);
//		IUserDao iUserDao = session.getMapper(IUserDao.class);
//		iUserDao.insertUser(user);
//		session.commit();
//		session.close();
		//删除
//		User user1 = new User("小张",20);
//		IUserDao iUserDao1 = session.getMapper(IUserDao.class);
//		iUserDao1.DeleteUser(user1);
//		session.commit();
//		session.close();
		//更新
		
	
	}
}
