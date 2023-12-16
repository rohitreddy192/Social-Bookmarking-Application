package com.javaproject.thrillio.daos;

import com.javaproject.thrillio.DataStore;
import com.javaproject.thrillio.entities.User;

public class UserDao {

	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
