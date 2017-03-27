package com.fuck.entity;

import java.io.Serializable;

public class Note implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnNoteId;
	private String cnNotebookId;
	private String cnUserId;
	private String cnNoteStatusId;
	private String cnNoteTypeId;
	private String cnNoteTitle;
	private String cnNoteBody;
	private long cnNoteCreateTime;
	private long cnNoteLastModifyTime;
	public Note(){
		
	}
	
	public Note(String cnNoteId, String cnNotebookId, String cnUserId, String cnNoteStatusId, String cnNoteTypeId,
			String cnNoteTitle, String cnNoteBody, long cnNoteCreateTime, long cnNoteLastModifyTime) {
		super();
		this.cnNoteId = cnNoteId;
		this.cnNotebookId = cnNotebookId;
		this.cnUserId = cnUserId;
		this.cnNoteStatusId = cnNoteStatusId;
		this.cnNoteTypeId = cnNoteTypeId;
		this.cnNoteTitle = cnNoteTitle;
		this.cnNoteBody = cnNoteBody;
		this.cnNoteCreateTime = cnNoteCreateTime;
		this.cnNoteLastModifyTime = cnNoteLastModifyTime;
	}

	public String getCnNoteId() {
		return cnNoteId;
	}

	public void setCnNoteId(String cnNoteId) {
		this.cnNoteId = cnNoteId;
	}

	public String getCnNotebookId() {
		return cnNotebookId;
	}

	public void setCnNotebookId(String cnNotebookId) {
		this.cnNotebookId = cnNotebookId;
	}

	public String getCnUserId() {
		return cnUserId;
	}

	public void setCnUserId(String cnUserId) {
		this.cnUserId = cnUserId;
	}

	public String getCnNoteStatusId() {
		return cnNoteStatusId;
	}

	public void setCnNoteStatusId(String cnNoteStatusId) {
		this.cnNoteStatusId = cnNoteStatusId;
	}

	public String getCnNoteTypeId() {
		return cnNoteTypeId;
	}

	public void setCnNoteTypeId(String cnNoteTypeId) {
		this.cnNoteTypeId = cnNoteTypeId;
	}

	public String getCnNoteTitle() {
		return cnNoteTitle;
	}

	public void setCnNoteTitle(String cnNoteTitle) {
		this.cnNoteTitle = cnNoteTitle;
	}

	public String getCnNoteBody() {
		return cnNoteBody;
	}

	public void setCnNoteBody(String cnNoteBody) {
		this.cnNoteBody = cnNoteBody;
	}

	public long getCnNoteCreateTime() {
		return cnNoteCreateTime;
	}

	public void setCnNoteCreateTime(long cnNoteCreateTime) {
		this.cnNoteCreateTime = cnNoteCreateTime;
	}

	public long getCnNoteLastModifyTime() {
		return cnNoteLastModifyTime;
	}

	public void setCnNoteLastModifyTime(long cnNoteLastModifyTime) {
		this.cnNoteLastModifyTime = cnNoteLastModifyTime;
	}

	@Override
	public String toString() {
		return "Note [cnNoteId=" + cnNoteId + ", cnNotebookId=" + cnNotebookId + ", cnUserId=" + cnUserId
				+ ", cnNoteStatusId=" + cnNoteStatusId + ", cnNoteTypeId=" + cnNoteTypeId + ", cnNoteTitle="
				+ cnNoteTitle + ", cnNoteBody=" + cnNoteBody + ", cnNoteCreateTime=" + cnNoteCreateTime
				+ ", cnNoteLastModifyTime=" + cnNoteLastModifyTime + "]";
	}
	
	
}
