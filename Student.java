package com.combination;
/*
 * 1. Define a Student class with attributes: studentId, studentName, 
 * course, year, percentage.
 * Implement a method to display student details.
 * Implement a method to calculate the student's grade based on the percentage.
 * Create a Main class to test the functionality.
 * */
public class Student {
  int studentId;// global/ fildes/ instance/ attributes / entity 
  String studentName;
  String course;
  int year;
  double percentage;

   
  public Student(int studentId , String studentName, String course,int year) {// CONSTRCTOR
	 this.studentId= studentId;
	 this.studentName = studentName;
	 this.course = course;
//	 this.percentage = percentage;
	 this.year = year;
	
  }
  public void studetails() {
	  System.out.println("****Student details****");
	  System.out.println("StudentId: "+studentId);
	  System.out.println("StudentName: "+ studentName);
	  System.out.println("Course: "+ course);
//	  System.out.println("Percentage: "+ percentage);
	  System.out.println("Year: "+year);
	System.out.println("**********************************");
  }
  public void findper(double percentage){
	  // why if why not taking switch case beacause IF is taking all  type of  primitive data type 
	if(percentage >= 80 && percentage <= 100){
		//61<=100
		this.percentage=percentage;
	System.out.println("Your percentage: " + percentage);		 
	System.out.println("Your Grade is A:");
	 }
	else if(percentage>=60){
		this.percentage=percentage;
		System.out.println("Your Gread is B:");
		System.out.println("Your percentage: " + percentage);	
	} else if(percentage >=40) {
		
		System.out.println("Your Gread is c");
		System.out.println("Your percentage: " + percentage);	
		}
	else {
		System.out.println("Your ar fail "+percentage);
	}
  }
 
 }

