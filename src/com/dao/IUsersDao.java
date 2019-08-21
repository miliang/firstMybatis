package com.dao;

import java.util.List;

public interface IUsersDao<User> {
	List<User> listUsers();
}
