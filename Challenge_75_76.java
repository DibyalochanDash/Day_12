package Challenge;


class Person { //Create an object with final fields and a constructor to initialize them.
    private final String name;
    private final int age;

    // Constructor to initialize final fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for final fields (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

  
}


public class Challenge_75_76 {

	public static void main(String[] args) {
		
		 Person person = new Person("Alice", 30);

	        // Accessing final fields
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
		
		
		
		
		
		
		
		 String[] words = {"Hello", "world", "from", "Java"};

	   //  Take an array of words and concatenate them into a single string using StringBuilder.
	        StringBuilder stringBuilder = new StringBuilder();
	        
	        for (String string : words) {
				stringBuilder.append(string).append(" ");
			}
         String concate = stringBuilder.toString().trim();
         
         System.out.println(concate);
	}

}
