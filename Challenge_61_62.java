package Challenge;

import java.util.Scanner;

public class Challenge_61_62 {
	
	public static void main(String[] args) {
		//Create a program using for loop multiplication table for a number.
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Your Number : ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " X "+ i + " = " + number*i);
		}
		
		
		// Create a program using for to display if a number is prime or not

	        System.out.print("Enter a number: ");
	        int input = sc.nextInt();

	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i * i <= input; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        sc.close();
	}

}
