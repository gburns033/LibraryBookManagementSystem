package edu.gz.lbms;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	Book() {
		this.title = "Unkown";
		this.author = "Unkown";
		this.ISBN = "Unkown";
		this.price = 0.0;
	}
	
	Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.ISBN = other.ISBN;
		this.price = other.price;
	}
}