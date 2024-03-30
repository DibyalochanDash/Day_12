package Challenge;

import java.util.Scanner;

public class Challenge_65_66 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter input (type 'exit' to quit):");

	        while (true) {
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting the loop.");
	                break; // Break out of the loop if "exit" is entered
	            }

	            System.out.println("You entered: " + input);//Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.
	        }

	      
	        
	        System.out.println();
	        
	        // Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.


	        int sum = 0;

	        System.out.println("Enter numbers (type a negative number to stop):");

	        while (true) {
	            int num = scanner.nextInt();

	            if (num < 0) {
	                System.out.println("Negative number entered. Skipping...");
	                continue; // Skip negative numbers and continue to the next iteration
	            }

	            sum += num;
	            System.out.println("Current sum: " + sum);
	        }
	        //scanner.close();
	}
	

}
