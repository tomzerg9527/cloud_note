package com.fuck.util;

import java.security.MessageDigest;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;

import com.fuck.exception.MD5Exception;



public class NoteUtil {
	
	public static String md5(String str){
		//����һ��md5ʵ��(��5��)
		try{
			MessageDigest mDigest=MessageDigest.getInstance("MD5");
			//���ڼ��ܵķ���   output�����صĶ������� ������
			byte[]output=mDigest.digest(str.getBytes());
			String ret=Base64.encodeBase64String(output);
			return ret;
		}catch (Exception e) {
			throw new MD5Exception("����ʧ��",e);
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
