package com.example.employee;

public class Main {

	public static void main(String[] args) {
		
		 // Create an instance of Employee
        Employee employee = new Employee("John Doe", 30, 50000.0);
        
        // Access and display employee details using package-private method
        employee.displayEmployeeDetails();
	}

}
