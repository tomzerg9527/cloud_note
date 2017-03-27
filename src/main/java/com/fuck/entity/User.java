package com.fuck.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public User() {

	}

	public User(String cnUserId, String cnUserName, String cnUserPassword, String cnUserToken, String cnUserNick) {
		super();
		this.cnUserId = cnUserId;
		this.cnUserName = cnUserName;
		this.cnUserPassword = cnUserPassword;
		this.cnUserToken = cnUserToken;
		this.cnUserNick = cnUserNick;
	}

	private String cnUserId;
	private String cnUserName;
	private String cnUserPassword;
	private String cnUserToken;
	private String cnUserNick;

	public String getCnUserId() {
		return cnUserId;
	}

	public void setCnUserId(String cnUserId) {
		this.cnUserId = cnUserId;
	}

	public String getCnUserName() {
		return cnUserName;
	}

	public void setCnUserName(String cnUserName) {
		this.cnUserName = cnUserName;
	}

	public String getCnUserPassword() {
		return cnUserPassword;
	}

	public void setCnUserPassword(String cnUserPassword) {
		this.cnUserPassword = cnUserPassword;
	}

	public String getCnUserToken() {
		return cnUserToken;
	}

	public void setCnUserToken(String cnUserToken) {
		this.cnUserToken = cnUserToken;
	}

	public String getCnUserNick() {
		return cnUserNick;
	}

	public void setCnUserNick(String cnUserNick) {
		this.cnUserNick = cnUserNick;
	}

	@Override
	public String toString() {
		return "User [cnUserId=" + cnUserId + ", cnUserName=" + cnUserName + ", cnUserPassword=" + cnUserPassword
				+ ", cnUserToken=" + cnUserToken + ", cnUserNick=" + cnUserNick + "]";
	}

}
