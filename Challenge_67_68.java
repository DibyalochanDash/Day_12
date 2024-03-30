package Challenge;

public class Challenge_67_68 {
	public static void main(String[] args) {
		//Create a program using continue to print only even numbers using continue for odd numbers.
		
		 int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array of numbers

	        System.out.println("Even numbers:");
	        
	        for (int i : numbers) {
	        	if (i % 2 != 0) {
					continue;
				}
			
	        System.out.print(i+" ");
	        }
	        System.out.println();
	       System.out.println("Odd Numbers :");
	       for (int j : numbers) {
			if (j % 2 == 0) {
				continue;
			}
			System.out.print(j+" ");
		}
	       
	       System.out.println();
	       //Create a program using recursion to display the Fibonacci series upto a certain number.
	       
	       int n = 10;
	       for (int i = 0; i <= n; i++) {
	    	  System.out.print(Febonacci(i)+" ");
		}
	       
	}

	private static int Febonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		return Febonacci(n -1)+ Febonacci(n-2);
		
	} 
	

}
