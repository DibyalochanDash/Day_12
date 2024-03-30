package com.example.employee;

// Define a class Employee with private attributes (like name, age, and salary), public methods to get and set these attributes,
//and a package-private method to displayEmployeeDetails. Create another class in the same package to test access to the displayEmployeeDetails method.
//Challenge _ 79
public class Employee {
	 private String name;
	    private int age;
	    private double salary;

	    // Constructor
	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    // Getter and setter methods for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and setter methods for age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Getter and setter methods for salary
	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Package-private method to display employee details
	    void displayEmployeeDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	    }

}
