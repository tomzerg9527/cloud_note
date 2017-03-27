package com.fuck.service;

import java.util.List;
import java.util.Map;

import com.fuck.entity.Note;
import com.fuck.exception.FuckThisException;

public interface NoteService {
	List<Map<String,Object>> allNoteBooks(String bookId);
	Note oneNoteBook(String noteId)throws FuckThisException;
	boolean updateNote(String id,String title,String body) throws FuckThisException;
}
