package com.spring.dao;

import java.util.List;
import com.spring.model.Book;

// DAO interface
public interface BookDAO {
	public void addBook(Book bk);  // Add a new book
    public Book getBookInfo(int id);  // Get detailed information of a book
    public Book findById(int id);  // Fetch a book by its ID
    public void updateBook(int id, String newTitle);  // Update the title of a book
    public void deleteBook(int id);  // Delete a book by its ID
    public List<Book> getAllBooks();  // Get all books
    public List<String> getTitles();  // Get all book titles
}
