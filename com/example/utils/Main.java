package com.example.utils;
import com.example.geometry.*;
public class Main {

	public static void main(String[] args) {
		
		 Circle circle = new Circle(5);
	        double circleArea = Calculator.calculateCircleArea(circle);
	        System.out.println("Area of Circle with radius " + circle.getRadius() + " is: " + circleArea);

	        // Creating Rectangle object
	        Rectangle rectangle = new Rectangle(4, 6);
	        double rectangleArea = Calculator.calculateRectangleArea(rectangle);
	        System.out.println("Area of Rectangle with length " + rectangle.getLength() + " and width " + rectangle.getWidth() + " is: " + rectangleArea);

	}

}
