package Challenge;

import java.util.Scanner;

public class Challenge_73_74 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);//Create a number guessing game where the program selects a random number, and the user has to guess it.

	        // Generate a random number between 1 and 100
	        int randomNumber = (int) (Math.random() * 100) + 1;

	        // Number of attempts
	        int attempts = 0;

	        // Game loop
	        while (true) {
	            System.out.print("Guess the number (between 1 and 100): ");
	            int guess = scanner.nextInt();
	            attempts++;

	            // Check if the guess is correct
	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
	                System.out.println("Number of attempts: " + attempts);
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Try again! The number is higher.");
	            } else {
	                System.out.println("Try again! The number is lower.");
	            }
	        }

	        scanner.close();
		
		
		
		
		
		System.out.println();
		
		
		
	
		
		
		
		int result = rollDice(); //  Simulate a dice roll using Math.random() and display the outcome (1 to 6).

        System.out.println("The outcome of the dice roll is: " + result);
    }

    public static int rollDice() {
        // Generate a random number between 1 and 6 (inclusive)
        // Math.random() generates a double between 0 (inclusive) and 1 (exclusive)
        // We multiply it by 6 and add 1 to shift the range to 1-6
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;

	}

}
