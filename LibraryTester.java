/*
 * Brandon Gerber
 * 2/2/2024
 * COP3804
 * LibraryTester.Java
 */
public class LibraryTester {
	public static void main(String [] args) {
		// create three books 
		Books one = new Books("Tuesdays with Morrie","Mitch Albom",2007,"9780307414090",true,13.99);
		Books two = new Books("Make your bed","William H. McRaven",2014,"9781455570249",true,11.00);
		Books three = new Books("The four agreements","Don Miquel Ruiz",1997,"9781934408322",true,12.95);
		//  display info for all books
		one.displayInfo();
		two.displayInfo();
		three.displayInfo();
		// borrow books one and two and then show how many books are available now
		one.borrowBook();
		two.borrowBook();
		// return book two 
		two.returnBook();
		// calculate the total number of available books
		System.out.println(one.totalAvailableBooks());
		two.returnBook();
		System.out.println(three.totalAvailableBooks());
		// calculate late fee for 5 days overdue
		two.calculateLateFee(5);
	}
}
