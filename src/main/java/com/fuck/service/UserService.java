package com.fuck.service;

import com.fuck.entity.User;
import com.fuck.exception.FuckThisException;
import com.fuck.exception.NameException;
import com.fuck.exception.NotFoundClassException;
import com.fuck.exception.PasswordException;

/**
 * 登入功能
 * name:用户名
 * password:密码
 * return:User entitiy
 * 用户名错:
 * 密码错误:
 * @author Administrator
 *
 */
public interface UserService {
	User login(String name,String password)throws NameException,PasswordException;
	void save(User user)throws NotFoundClassException,FuckThisException;
}
