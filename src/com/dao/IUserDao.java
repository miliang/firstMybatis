package com.dao;

import com.pojo.User;

public interface IUserDao {
	User selectAllUser();
	void insertUser(User user);
	void updateUser(User user);
	void DeleteUser(User user);
}
