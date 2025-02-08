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
	
	/**
	 * Gets the title of the book.
	 * 
	 * @return The title of the book.
	 */
	public String getTitle() {
	    return this.title;
	}

	/**
	 * Gets the author of the book.
	 * 
	 * @return The author's name.
	 */
	public String getAuthor() {
	    return this.author;
	}

	/**
	 * Gets the ISBN of the book.
	 * 
	 * @return The ISBN number as a String.
	 */
	public String getISBN() {
	    return this.ISBN;
	}

	/**
	 * Gets the price of the book.
	 * 
	 * @return The price of the book.
	 */
	public double getPrice() {
	    return this.price;
	}

	/**
	 * Sets the title of the book.
	 * 
	 * @param title The new title to set.
	 */
	public void setTitle(String title) {
	    this.title = title;
	}

	/**
	 * Sets the author of the book.
	 * 
	 * @param author The author's name to set.
	 */
	public void setAuthor(String author) {
	    this.author = author;
	}

	/**
	 * Sets the ISBN of the book.
	 * 
	 * @param ISBN The new ISBN to set.
	 */
	public void setISBN(String ISBN) {
	    this.ISBN = ISBN;
	}

	/**
	 * Sets the price of the book.
	 * 
	 * @param price The new price to set.
	 */
	public void setPrice(double price) {
	    this.price = price;
	}

	/**
	 * Returns a formatted string representation of the book.
	 * 
	 * @return A string containing the book's title, author, ISBN, and price.
	 */
	@Override
	public String toString() {
	    return String.format("Title: %s\nAuthor: %s\nISBN: %s\nPrice: $%.2f", this.title, this.author, this.ISBN, this.price);
	}
	
	/**
	 * Compares the ISBN values of this book with a given one.
	 * 
	 * @param other The book to compare with.
	 * @return true if the ISBNs match false otherwise.
	 */
	public boolean equals(Book other) {
	    return other != null && ISBN.equals(other.ISBN);
	}
}