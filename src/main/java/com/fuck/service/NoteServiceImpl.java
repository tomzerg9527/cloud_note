package com.fuck.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fuck.dao.NoteDAO;
import com.fuck.entity.Note;
import com.fuck.exception.FuckThisException;
import com.fuck.exception.NotFoundNoteException;
@Service("noteService")
public class NoteServiceImpl implements NoteService {
	@Resource(name="noteDAO")
	private NoteDAO dao;
	
	public List<Map<String, Object>> allNoteBooks(String bookId) throws NotFoundNoteException{
		List<Map<String,Object>> noteBooks=null;
		noteBooks=dao.findAllNot(bookId);
		if(noteBooks==null)
			throw new NotFoundNoteException("没有查找到笔记本");
		return noteBooks;
	}

	public Note oneNoteBook(String noteId) throws FuckThisException{
		Note note=null;
		if(noteId==null||noteId.trim().isEmpty())
			throw new FuckThisException("noteId为空");
		note=dao.findOneNote(noteId);
		if(note==null)
			throw new FuckThisException("返回值为空");
		return note;
	}

	public boolean updateNote(String id, String title, String body) throws FuckThisException{
		System.out.println("title:"+title+",body:"+body);
		
		if(id==null||id.trim().isEmpty())
			throw new FuckThisException("id参数为null");
		if(title==null||title.trim().isEmpty())
			throw new FuckThisException("titile为null");
		if(body==null)
			body="";
		Note note=new Note();
		note.setCnNoteId(id);
		note.setCnNoteBody(body);
		note.setCnNoteTitle(title);
		note.setCnNoteLastModifyTime(System.currentTimeMillis());
		int f=dao.update(note);
		Note n=dao.findOneNote(id);
		System.out.println("service:"+n);
		if(f>0&&f!=-1)
			return true;	
			return false;
	}

}
