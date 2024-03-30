package Challenge;

public class Challenge_63_64 {

	public static void main(String[] args) { 
		
		 int[] numbers = {10, 23, 5, 17, 8, 30, 14}; 
	        
	        int max = findMaximumValue(numbers);//
	        
	        System.out.println("The maximum value in the array is: " + max);
	        
	        System.out.println();

	        int[] arr = {2, 3, 5, 2, 7, 2, 5, 8, 2}; // Sample integer array
	        int target = 2; // Element to count occurrences for

	        int occurrences = countOccurrences(arr, target);

	        System.out.println("The number of occurrences of " + target + " in the array is: " + occurrences);
	}

	private static int countOccurrences(int[] arr, int target) {
	     
		int count = 0;
		
		for (int i : arr) {
		  if (i == target) {
			count++;
		}
		}
		return count ;
	}

	private static int findMaximumValue(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int i : numbers) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

}
