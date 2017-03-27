package com.fuck.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cnNotebookId;;
	private String cnUserId;
	private String cnNotebookTypeId;
	private String cnNotebookName;
	private Object cnNotebookDesc;
	private Timestamp cnNotebookCreatetime;
	
	public Book(){
		
	}

	public Book(String cnNotbookId, String cnUserId, String cnNotebookTypeId, String cnNotebookName,
			Object cnNotebookDesc, Timestamp cnNotebookCreatetime) {
		super();
		this.cnNotebookId = cnNotbookId;
		this.cnUserId = cnUserId;
		this.cnNotebookTypeId = cnNotebookTypeId;
		this.cnNotebookName = cnNotebookName;
		this.cnNotebookDesc = cnNotebookDesc;
		this.cnNotebookCreatetime = cnNotebookCreatetime;
	}

	public String getCnNotebookId() {
		return cnNotebookId;
	}

	public void setCnNotebookId(String cnNotbookId) {
		this.cnNotebookId = cnNotbookId;
	}

	public String getCnUserId() {
		return cnUserId;
	}

	public void setCnUserId(String cnUserId) {
		this.cnUserId = cnUserId;
	}

	public String getCnNotebookTypeId() {
		return cnNotebookTypeId;
	}

	public void setCnNotebookTypeId(String cnNotebookTypeId) {
		this.cnNotebookTypeId = cnNotebookTypeId;
	}

	public String getCnNotebookName() {
		return cnNotebookName;
	}

	public void setCnNotebookName(String cnNotebookName) {
		this.cnNotebookName = cnNotebookName;
	}

	public Object getCnNotebookDesc() {
		return cnNotebookDesc;
	}

	public void setCnNotebookDesc(Object cnNotebookDesc) {
		this.cnNotebookDesc = cnNotebookDesc;
	}

	public Timestamp getCnNotebookCreatetime() {
		return cnNotebookCreatetime;
	}

	public void setCnNotebookCreatetime(Timestamp cnNotebookCreatetime) {
		this.cnNotebookCreatetime = cnNotebookCreatetime;
	}

	@Override
	public String toString() {
		return "Book [cnNotebookId=" + cnNotebookId + ", cnUserId=" + cnUserId + ", cnNotebookTypeId=" + cnNotebookTypeId
				+ ", cnNotebookName=" + cnNotebookName + ", cnNotebookDesc=" + cnNotebookDesc
				+ ", cnNotebookCreatetime=" + cnNotebookCreatetime + "]";
	}

	
}
