package com.fuck.service;

import com.fuck.entity.User;
import com.fuck.exception.FuckThisException;
import com.fuck.exception.NameException;
import com.fuck.exception.NotFoundClassException;
import com.fuck.exception.PasswordException;

/**
 * ���빦��
 * name:�û���
 * password:����
 * return:User entitiy
 * �û�����:
 * �������:
 * @author Administrator
 *
 */
public interface UserService {
	User login(String name,String password)throws NameException,PasswordException;
	void save(User user)throws NotFoundClassException,FuckThisException;
}
