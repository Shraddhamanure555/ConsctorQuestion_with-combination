package com.book;
/*5.Define a Book class with attributes: bookId, title, author, price, availableCopies.
Implement methods for issueBook, returnBook, and displayBookDetails.
Ensure issued books do not exceed available copies.
Create a Main class to test the scenario.*/
public class Book {
int bookId;
String title;
String author;
double price;
int availableCopies;
// used the constrctor and use this keyword to show global value or fides and run before the method 

public Book(int bookId,String title,String author,double price,int availableCopies){
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.price = price;
	this.availableCopies = availableCopies;
	 
	
	
}
//Ensure issued books do not exceed available copies.
 public void issueBook(int copies){
	 
	 if(copies <= 0) {
	 System.out.println("invalid copies issue : ");// this is false condition 
	 }
	 else if(copies > availableCopies){
		System.out.println("not enough copies are avaliable "+availableCopies);
	 }
	 else {
		   availableCopies = availableCopies - copies ; 
		 System.out.println("Successfully purchaed: "+ availableCopies);
		 
	 }
	 //System.out.println("------------");
 }
 
 public void returnBook(int count){
	 if(count <= 0) {
		 System.out.println("Copies are not return: ");
		// yet not book return & the conunt is less than zero 
	 }
	 else {
		 // if any copies will return then added in available right 
		 availableCopies += count;
		 System.out.println("Copies are returned back to library: "+ availableCopies);
		 System.out.println("Count the copies are returned "+ count);
	 }
	 System.out.println("------------");
	
 }
 
 public void displayBookDetails(){
	 System.out.println("BookId: "+bookId);
	 System.out.println("Title: "+ title);
	 System.out.println("Author: "+author);
	 System.out.println("Price: "+price);
	 System.out.println("AvailableCopies: "+ availableCopies);
	
 }
 
 
}
