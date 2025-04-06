package com.book;
/*5.Define a Book class with attributes: bookId, title, author, price, availableCopies.
   Implement methods for issueBook, returnBook, and displayBookDetails.
   Ensure issued books do not exceed available copies.
   Create a Main class to test the scenario.*/
public class BookDetails {
public static void main(String args[]) {
	System.out.println("++++++++++Book Details+++++++++++");
	Book bk = new Book(101,"Industrial java programming","Kiran sir",50.25, 50);
	bk.displayBookDetails();
	bk.issueBook(1); // here the method also depend on which line declare on after and before beacuse the last line --- show at end
	bk.returnBook(2);
	
	
	bk.displayBookDetails();
	bk.issueBook(5);
	bk.returnBook(-1);
	
}
}
