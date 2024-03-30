package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {

	
	public static double calculateCircleArea(Circle circle) {
        return circle.calculateArea();
    }

    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.calculateArea();
    }
}
