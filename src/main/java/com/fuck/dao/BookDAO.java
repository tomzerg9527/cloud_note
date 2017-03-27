package com.fuck.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.fuck.entity.Book;
@Repository("bookDAO")
public interface BookDAO {
	List<Book> selectAllBook(String userId);
}
