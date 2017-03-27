package com.fuck.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fuck.dao.UserDAO;
import com.fuck.entity.User;
import com.fuck.exception.FuckThisException;
import com.fuck.exception.NameException;
import com.fuck.exception.NotFoundClassException;
import com.fuck.exception.PasswordException;
import com.fuck.util.NoteUtil;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDAO")
	private UserDAO dao;
	public User login(String name, String password) throws NameException, PasswordException {
		User user=null;
		user=dao.findByName(name);
		if(name==null||name.trim().isEmpty())
			throw new NameException("�û���Ϊ��");
		if(password==null||password.trim().isEmpty())
			throw new PasswordException("����Ϊ��");
		//�����û��������û���Ϣ
		//�ѿͻ����������������,�������ݿ��е�ֵ�Ա�
		if(user==null)
			throw new NameException("�û�������");
		String md5Password=NoteUtil.md5(password);
		if(user.getCnUserPassword().equals(md5Password))	
			return user;
		else
			throw new PasswordException("�������");
	}
	
	public void save(User user) throws NotFoundClassException,FuckThisException{
		if(user==null)
			throw new NotFoundClassException("��Ч��Class");
		User usdr=dao.findByName(user.getCnUserName());
		if(usdr!=null)
			throw new FuckThisException("�û����Ѵ���");
		try{
			dao.addUser(user);
		}catch(Exception e){
			throw new FuckThisException("ϵͳ�ڲ�����!");
		}
	}

}
