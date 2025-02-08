package edu.gz.lbms;

public class LibraryApp {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book lastDaysOfNight = new Book("The Last Days of Night", "Graham Moore", "978-0-8129-8892-5", 19.0);
		
		System.out.println("Adding books...");
		
		library.addBook(new Book("Just Mercy A Story of Justice and Redemption", "Bryan Stevenson", "978-0-8129-8496-5", 18.0));
		library.addBook(new Book("The Radium Girls", "Kate Moore", "978-1-4926-5095-9", 18.99));
		library.addBook(lastDaysOfNight);
		
		System.out.println("The following three books have been added successfully:");
		library.displayBooks();
		
		Book test = library.searchByISBN("978-0-8129-8892-5");
		System.out.println("Searching for ISBN: 978-0-8129-8892-5");
		System.out.println("978-0-8129-8892-5 found successfully:");
		System.out.println(test.toString());
		
		System.out.println();
		
		System.out.println("Attemping removal for ISBN: 978-0-8129-8892-5 (The Last Days of Night)");
		library.removeBook(lastDaysOfNight);
		System.out.println("The library now looks like this:");
		library.displayBooks();
		
		System.out.println("Attemping removal for ISBN: 978-0-8129-8892-5 (The Last Days of Night)");
		library.removeBook(lastDaysOfNight);
		System.out.println("The library now looks like this:");
		library.displayBooks();
	}
}
