package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.HibernateConfiguration;
import com.spring.dao.BookDAO;
import com.spring.model.Book;

public class Main {

    public static void main(String args[]) {
        // Initialize the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);

        // Get the BookDAO bean from the Spring context
        BookDAO dao = (BookDAO) context.getBean("bookdao");

       
        // Adding books to the database
//        dao.addBook(new Book(1, "Head First Java"));
//        dao.addBook(new Book(2, "Complete Ref"));
//        dao.addBook(new Book(3, "Thinking Java"));

        // Fetch all books and print their details
        List<Book> booklist = dao.getAllBooks();
        for (Book b : booklist) {
            System.out.println(b);
        }

        // Fetch all book titles and print them
        List<String> titles = dao.getTitles();
        for (String t : titles) {
            System.out.println(t);
        }

        // Uncomment below to test the update and delete methods
         dao.updateBook(3, "Updated Java Book");
         dao.deleteBook(2);
         
         dao.addBook(new Book(1, "C++"));
         dao.addBook(new Book(2,"C Programming"));
         dao.addBook(new Book(3, "RWD"));

       
    }
}
