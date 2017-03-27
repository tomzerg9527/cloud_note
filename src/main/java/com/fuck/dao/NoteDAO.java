package com.fuck.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fuck.entity.Note;
import com.fuck.exception.NotFoundNoteException;

@Repository("noteDAO")
public interface NoteDAO {
	
	List<Map<String,Object>> findAllNot(String bookId) throws NotFoundNoteException;
	Note findOneNote(String noteId);
	int update(Note note);
}
