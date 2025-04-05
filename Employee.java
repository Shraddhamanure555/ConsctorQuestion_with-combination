package com.emp;
/*
 * 
 *  Define an Employee class with attributes: empId, empName, designation, salary.
   Implement a method to display employee details.
   Implement a method to calculate bonus (10% of salary if salary < 50,000, otherwise 5%).
   Create a Main class to test the logic.
 * */
public class Employee {
 int empId;
 String Name;
 String designation;
 int salary;
// double salary;/
 
 // Implement a method to display employee details.
 public Employee(int empId,String Name,String designation,int salary) {
	 this.empId = empId;
	 this.Name = Name;
	 this.designation = designation;
	 this.salary = salary;
	 // print the details of employees
//		System.out.println("Employee details");
		System.out.println("     ");
		System.out.println("------------------------------------");
	 System.out.println("empId : "+empId);
	 System.out.println("Name : "+Name);
	 System.out.println("designation : "+designation);

	  
	 }
	 	 
	
	 
 public void calculateBonus(int salary) {
	 this.salary = salary;
	 
	 if (salary < 50000) {
		 System.out.println("geeting the 10% Bouns: ");
		 
	 }
	 else {
		 System.out.println("geeting the 5% Bouns: ");
	 }
 }
}
