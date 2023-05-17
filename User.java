package com.toy.hibernateAssign2;


	import java.util.List;
	import java.util.ArrayList;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;
	@Entity
	public class User {
		@Id
		private int id;
		
		private String user_name;
		
		@OneToOne
		private Book book;
		
		
		
		@OneToMany
		private List<Book> books= new ArrayList<Book>();
		public Book getBook() {
			return book;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
		public void setBook(Book book) {
			this.book = book;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		
		
	}


