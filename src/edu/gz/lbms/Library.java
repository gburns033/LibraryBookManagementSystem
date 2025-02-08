package edu.gz.lbms;

public class Library {
	private Book[] books = new Book[5];
	private int count;

	/**
	 * Adds a book to the array if there is an available slot.
	 * 
	 * @param book The book to be added.
	 * @return true if the book was added successfully, false if the book is null or the collection is full.
	 */
	public boolean addBook(Book book) {
	    if (book == null) {
	        return false;
	    }

	    for (int i = 0; i < books.length; i++) {
	        if (books[i] == null) {
	            books[i] = book;
	            return true;
	        }
	    }

	    return false;
	}

	/**
	 * Removes a book from the array if it exists.
	 * 
	 * @param book The book to be removed.
	 * @return true if the book was removed successfully, false if the book is null or not found.
	 */
	public boolean removeBook(Book book) {
	    if (book == null) {
	        return false;
	    }

	    for (int i = 0; i < books.length; i++) {
	        if (books[i] != null && books[i].equals(book)) {
	            books[i] = null;
	            return true;
	        }
	    }

	    return false;
	}

	/**
	 * Searches for a book by its ISBN.
	 * 
	 * @param ISBN The ISBN number of the book to search for.
	 * @return The book with the matching ISBN, or null if not found.
	 */
	public Book searchByISBN(String ISBN) {
	    if (ISBN == null) {
	        return null;
	    }

	    for (int i = 0; i < books.length; i++) {
	        if (books[i] != null && books[i].getISBN().equals(ISBN)) {
	            return books[i];
	        }
	    }

	    return null;
	}

	/**
	 * Displays information about all books in the array.
	 */
	public void displayBooks() {
	    for (int i = 0; i < books.length; i++) {
	        if (books[i] != null) {
	            System.out.println(books[i].toString());
	        }
	    }
	}

}