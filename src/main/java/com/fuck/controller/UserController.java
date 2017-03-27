package com.fuck.controller;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fuck.entity.User;
import com.fuck.exception.FuckThisException;
import com.fuck.exception.MD5Exception;
import com.fuck.exception.NameException;
import com.fuck.exception.NotFoundClassException;
import com.fuck.exception.NotFoundNoteException;
import com.fuck.exception.PasswordException;
import com.fuck.service.UserService;
import com.fuck.util.JsonResult;
import com.fuck.util.NoteUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public Object login(String name,String pwd){
		System.out.println("name:"+name+";pwd:"+pwd);
			User user=userService.login(name, pwd);
			return new JsonResult(user);
	}
	
	@ResponseBody
	@RequestMapping("/regist.do")
	public Object regist(String name,String nickname,String pwd1){
		User user=new User();
		user.setCnUserId(NoteUtil.createId());
		user.setCnUserName(name);
		user.setCnUserNick(nickname);
		user.setCnUserPassword(NoteUtil.md5(pwd1));
		userService.save(user);
			return new JsonResult(user,"ע��ɹ�");
	}
	
	
}
