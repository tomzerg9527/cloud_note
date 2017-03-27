package com.fuck.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fuck.entity.Book;
import com.fuck.exception.FuckThisException;
import com.fuck.service.BookService;
import com.fuck.util.JsonResult;

@Controller
@RequestMapping("/book")
public class BookController {
	@Resource(name="bookService")
	private BookService bser;
	@ResponseBody
	@RequestMapping("/find.do")
	public Object findAllBook(String userId){
		System.out.println(userId);
		List<Book> books=bser.findBookById(userId);
		return new JsonResult(books);
	}
	
}
