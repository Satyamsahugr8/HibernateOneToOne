package net.codejava.hibernateForeign;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookManager {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// creates a Book entity
        Book newBook = new Book();
        newBook.setTitle("Hibernate Made Easy");
        newBook.setDescription("Simplified Data Persistence with Hibernate and JPA");
        newBook.setPublishedDate(new Date());
        
        newBook.setAuthor(new Author("Cameron Wallace McKenzie", "Cameron@gmail.com"));
        
//        // persists the book entity
//        Long bookId = (Long) session.save(newBook);
         
//        // gets the book entity back
//        Book book = session.get(Book.class, bookId);
//        System.out.println("Book's Title: " + book.getTitle());
//        System.out.println("Book's Description: " + book.getTitle());
//         
//        Author author = book.getAuthor();
//        System.out.println("Author's Name: " + author.getName());
//        System.out.println("Author's Email: " + author.getEmail());
         
        
        session.save(newBook);
        
    
        
        session.getTransaction().commit();
        session.close(); 

	}

}
