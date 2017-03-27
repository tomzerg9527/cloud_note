package com.fuck.aspect;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionBean {
	//e 是目标组件方法抛出的异常
	@AfterThrowing(throwing="e",
			pointcut="execution(* com.fuck.service..*.*(..))")
	public void execute(Exception e){
		//创建日志文件
		try{
			FileWriter fw=new FileWriter("D:\\cloudnote.log",true);
			//利用pw对象写入信息
			PrintWriter pw=new PrintWriter(fw);
			//定义时间字符串
			SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			String date=sdf.format(new Date());
			//写入异常信息
			pw.println("************************");
			pw.println("*异常类型:"+e);
			pw.println("*发生时间:"+date);
			e.printStackTrace(pw);
			pw.close();
			fw.close();
		}catch(Exception ex){
			
		}
		
		
	}
}
