package com.toy.hibernateAssign2;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="book_table")
	public class Book {
		@Id
		private int id;
		
		private String book_name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		
		
	}

