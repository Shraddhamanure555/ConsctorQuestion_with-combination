package com.combination;
/*  Practice Questions Combination of Method, Constructor, Instance variables : 

 * 1. Define a Student class with attributes: studentId, studentName, 
 * course, year, percentage.
 * Implement a method to display student details.
 * Implement a method to calculate the student's grade based on the percentage.
 * Create a Main class to test the functionality.

 * */

// calling the student class 
public class StudentDetails {
  public static void main(String args[]) {
	 Student st = new Student(101,"h","ai",2021);
	 st.studetails();
	 st.findper(25); 	
	 }
}
