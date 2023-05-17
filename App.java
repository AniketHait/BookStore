package com.toy.hibernateAssign2;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
        	
        	Book book = new Book();
        	book.setBook_name("Doglapan");
        	book.setId(101);
        	Book book1 = new Book();
        	book1.setBook_name("DumbWitness");
        	book1.setId(102);
        	Book book2 = new Book();
        	book2.setBook_name("Karma");
        	book2.setId(103);
        	List<Book> list = Arrays.asList(book,book1,book2);
        	User user =new User();
        	user.setId(1);
        	user.setUser_name("Devansh");
        	user.setBooks(list);
        	
    Configuration config = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(User.class);
        	
        	
        	
        	 SessionFactory factory = config.buildSessionFactory();
        	
        	Session session = factory.openSession();
        	Transaction tx = session.beginTransaction();
        	
        	
    		session.save(book);
    		session.save(user);
        	
        	
        	tx.commit();
        	System.out.println(book);
        }
    
    }

