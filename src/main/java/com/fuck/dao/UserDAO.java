package com.fuck.dao;

import org.springframework.stereotype.Repository;

import com.fuck.entity.User;

@Repository("userDAO")
public interface UserDAO {
	User findByName(String cnUserName);
	void addUser(User user);
}
