package com.fuck.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fuck.exception.FuckThisException;
import com.fuck.exception.MD5Exception;
import com.fuck.exception.NameException;
import com.fuck.exception.NotFoundClassException;
import com.fuck.exception.NotFoundNoteException;
import com.fuck.exception.PasswordException;
import com.fuck.util.JsonResult;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler
	@ResponseBody
	public Object allException(Exception e){
		if(e instanceof FuckThisException)
			return new JsonResult(404,e);
		if(e instanceof NameException)
			return new JsonResult(202,e);
		if(e instanceof PasswordException)
			return new JsonResult(101,e);
		if(e instanceof MD5Exception)
			return new JsonResult(505,e);
		if(e instanceof NotFoundClassException)
			return new JsonResult(303,e);
		if(e instanceof NotFoundNoteException)
			return new JsonResult(606,e);
		else
			return new JsonResult("服务器内部错误!");
	}
}
