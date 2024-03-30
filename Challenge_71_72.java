package Challenge;

public class Challenge_71_72 {

	public static void main(String[] args) {
		
		String str1 = "Hello Jimmy";
		String str2 = " ! How are You.";
		//Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.
		ConCateString(str1,str2);
		
		System.out.println();
		
		// Calculate the area and circumference of a circle for a given radius using Math.PI
		
		int radius = 7;
		
		CalculateArea_Circumferance(radius);

	}

	private static void CalculateArea_Circumferance(int radius) {
		 double area = Math.PI * radius * radius;
	        double circumference = 2 * Math.PI * radius;

	        // Print the results
	        System.out.println("Area of the circle: " + area);
	        System.out.println("Circumference of the circle: " + circumference);
		
	}

	private static void ConCateString(String str1, String str2) {
		
		System.out.println((str1+str2).toUpperCase());
		System.out.println((str1+str2).toLowerCase());
	}

}
