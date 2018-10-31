package com.Design_an_onlineBook;

/*  
* The classes for User and Book simply hold data and  
* provide little functionality. 
* This class represents the Book which is a simple POJO 
*/

class Book {
	private int bookId;
	private String details;
	private String title;

	public Book(int id, String details, String title) {
		bookId = id;
		this.details = details;
		this.title = title;
	}

	public int getId() {
		return bookId;
	}

	public void setId(int id) {
		bookId = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}