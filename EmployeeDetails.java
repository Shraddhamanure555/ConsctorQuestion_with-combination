package com.emp;
/*
 * Define an Employee class with attributes: empId, empName, designation, salary.
   Implement a method to display employee details.
   Implement a method to calculate bonus (10% of salary if salary < 50,000, otherwise 5%).
   Create a Main class to test the logic.
 * 
 * */
public class EmployeeDetails {
public static void main(String args[]) {
	System.out.println("Employee details");
	Employee ep =new Employee(101,"Govrav", "Data Scientist", 45000);
	ep.calculateBonus(20000);	
	
	
	Employee ep1 =new Employee(102,"shradha","busness ananysit",75000);
	ep1.calculateBonus(70000);

	
}
}
