/*
 * Brandon Gerber
 * 2/2/2024
 * COP3804
 * Books.java
 */
public class Books {
public String title;
public String author;
public int publicationYear;
public String ISBN;
public boolean available;
public double price;
private static int totalAvailableBooks = 0;
public int daysOverdue;
public double lateFee;
	// constructor 
	public Books(String t, String a, int py, String num, boolean avail, double p) {
	    title = t;
	    author = a;
	    publicationYear = py;
	    ISBN = num;
	    available = avail;
	    price = p;
	    totalAvailableBooks++;
	}
	// setters
	public void setTitle(String t) {
		t = title;
		}
	public void setAuthor(String a) {
		a = author;
	}
	public void setYear(int py) {
		py = publicationYear;
	}
	public void setISBN(String num) {
		num = ISBN;
	}
	public void setAvailable(boolean avail) {
		avail = available;
	}
	public void setPrice(double p) {
		p = price;
	 }
	 // getters
	public String getTitle() {
		return title;
}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return publicationYear;
	}
	public String getISBN() {
		return ISBN;
	}	
	public boolean getAvailable() {
		return available;
	}
	public double getPrice() {
		return price;
	}
		// display all info
	public void displayInfo() {
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear + "\nISBN: " + ISBN + "\nAvailable: " + available + "\nPrice: " + price);

	}
	// borrowing book, if its available decrement available books
	public void borrowBook() {
		if(available == true) {
			System.out.println("The book is available to be borrowed, Total books available: " +totalAvailableBooks--);
			available = false;
		} else System.out.println("Sorry, this book is already borrowed");
	}
	// return book, increment book when book is put back into totalavailablebooks
	public void returnBook() {
		if(available == false) {
		 	System.out.println("The book is not available, Total books available: " +totalAvailableBooks++);
		 	available = true;
		} else System.out.println("Sorry, this book is already in the library");
		}
	public void calculateLateFee(int daysOverdue) {
		lateFee = (.5*daysOverdue);
		System.out.println("Your late fee for this book is $" +lateFee);
	} // method to return totalavailablebooks
		public int totalAvailableBooks() {
			return totalAvailableBooks;
		}
	}

