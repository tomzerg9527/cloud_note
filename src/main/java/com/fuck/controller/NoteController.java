package com.fuck.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fuck.entity.Note;
import com.fuck.service.NoteService;
import com.fuck.util.JsonResult;

@Controller
@RequestMapping("/note")
public class NoteController {
	@Resource(name="noteService")
	private NoteService noteService;
	
	@RequestMapping("/find.do")
	@ResponseBody
	public Object noteBooks(String bookId){
		System.out.println(bookId);
		List<Map<String,Object>> noteBooks=noteService.allNoteBooks(bookId);
		return new JsonResult(noteBooks);
	}
	
	@RequestMapping("/one.do")
	@ResponseBody
	public Object oneNoteBook(String noteId){
		System.out.println(noteId);
		Note note=noteService.oneNoteBook(noteId);
		return new JsonResult(note);
	}
	
	
	@RequestMapping("/update.do")
	@ResponseBody
	public Object update(String title,String id,String body){
		System.out.println("title:"+title+",id:"+id+",body:"+body);
		boolean f=noteService.updateNote(id, title, body);
		if(f)
			return new JsonResult(0,"修改成功");
		else
			return new JsonResult(0,"修改失败");
	}
}
