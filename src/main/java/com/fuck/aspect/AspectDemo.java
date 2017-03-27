package com.fuck.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //等价于<aop:aspect ref="loggerBean">
public class AspectDemo {
	
	//@Before("within(com.fuck.controller..*)")
	//@Before("execution(* com.fuck.service..UserService.*(..))")
	//@Before("bean(userController)")
	@Before("execution(* com.fuck.controller..UserController.login(..))")
	public void testAop(){
		System.out.println("AOP实现注入");
		System.out.println("在执行方法前");
	}
}
