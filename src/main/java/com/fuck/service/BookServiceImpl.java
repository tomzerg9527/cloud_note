package com.fuck.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fuck.dao.BookDAO;
import com.fuck.entity.Book;
import com.fuck.exception.FuckThisException;
@Service("bookService")
public class BookServiceImpl implements BookService {
	@Resource(name="bookDAO")
	private BookDAO dao;
	public List<Book> findBookById(String userId) throws FuckThisException{
		List<Book> books=null;
		books=dao.selectAllBook(userId);
		if(books==null)
			throw new FuckThisException("û�в鵽����");
		if(userId==null||userId.isEmpty())
			throw new FuckThisException("�����Ƿ�ر���Cookie");
		return books;
	}

}
