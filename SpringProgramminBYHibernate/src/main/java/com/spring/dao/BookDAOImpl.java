package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Book;

@Transactional //removes the need for manual commit/rollback 
@Repository("bookdao") 
public class BookDAOImpl implements BookDAO {

    @Autowired 
    private SessionFactory sessionFactory;//sessionFactory is an object provided by Hibernate 
    									//that is used to interact with the database.

    // This method will be invoked again and again
    protected Session getSession()//This helper method returns the current Hibernate Session
    {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addBook(Book bk) {
    	//insert book //saves a Book object into the database using the save() method of Hibernate.
        getSession().save(bk);
    }

    @Override
    public Book getBookInfo(int id) {
        // Fetch the book by its ID (code) //get()
        return (Book) getSession().get(Book.class, id);
    }

    @Override
    public Book findById (int id) {    
        // Find a book by its ID (code) //get()
        return (Book) getSession().get(Book.class, id);
    }

    @Override
    public void updateBook(int id, String newTitle) {
        // Update the book title based on its ID (code)
        Book bk = (Book) getSession().get(Book.class, id);
        if (bk != null) {
            bk.setTitle(newTitle);  // Set the new title
            getSession().update(bk);  // Update the book in the database
        }
    }

    @Override
    public void deleteBook(int id) {
        // Delete a book by its ID (code)
        Book b = (Book) getSession().get(Book.class, id);
        if (b != null) {
            getSession().delete(b);  // Delete the book
        }
    }

    @Override
    public List<Book> getAllBooks() {
        // Fetch all books using a query from the "Book" entity
        Query q = getSession().createQuery("from Book b");
        return q.list();  // Return the list of books
    }

    @Override
    public List<String> getTitles() {
        // Fetch only the titles of all books using the select clause
        Query q = getSession().createQuery("select b.title from Book b");
        return q.list();  // Return the list of titles
    }
    //CRUD Operations: save(), update(), delete(), get(), load(), merge()    
}
 