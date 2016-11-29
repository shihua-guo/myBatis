package com.briup.book;

import java.util.List;
import java.util.Map;

public interface BookMapper {
	public int add(Book b);
	public Book findBookByName(String bookName);
	public Book findBookById(int id);
	public List<Book> findAllBooks();
	public List<String> findAllBooksName();
	public int findCountOfBook();
	public void updateBook(Book book);
	public List<Map<String,String>> findBookNameAndAuthor();
}
