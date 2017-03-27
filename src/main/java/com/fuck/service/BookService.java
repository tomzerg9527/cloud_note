package com.fuck.service;

import java.util.List;

import com.fuck.entity.Book;

public interface BookService {
	List<Book> findBookById(String userId);
}
