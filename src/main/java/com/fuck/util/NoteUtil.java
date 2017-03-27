package com.fuck.util;

import java.security.MessageDigest;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;

import com.fuck.exception.MD5Exception;



public class NoteUtil {
	
	public static String md5(String str){
		//创建一个md5实例(第5版)
		try{
			MessageDigest mDigest=MessageDigest.getInstance("MD5");
			//用于加密的方法   output：返回的都是乱码 不优雅
			byte[]output=mDigest.digest(str.getBytes());
			String ret=Base64.encodeBase64String(output);
			return ret;
		}catch (Exception e) {
			throw new MD5Exception("加密失败",e);
		}
	}
	
	public static String createId(){
		String id=UUID.randomUUID().toString();
		return id;
	}
	
	public static void main(String[] args) {
		System.out.println(md5("123"));
	}
}
