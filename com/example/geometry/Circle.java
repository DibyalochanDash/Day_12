 //Create a simple application with at least two packages: com.example.geometry and com.example.utils. In the geometry package, define classes like Circle and Rectangle. In the utils package, create a Calculator class that can compute areas of these shapes.
// Challenge 77
package com.example.geometry;

public class Circle {

	 private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}
	
	
