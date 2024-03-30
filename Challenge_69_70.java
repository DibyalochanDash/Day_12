package Challenge;

//Define a Student class with fields like name and age, and use toString to print student details.

class Student{
	private String name;
	private int age ;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}


public class Challenge_69_70 {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("jimmy",21);
		
	System.out.println(s1);
		
	
		
		
		//Create a program to check if a string is a palindrome.
		
		String input = "level";
		
		String res = StringPalindromeCheck(input);
       System.out.println(res);
	}

	private static String StringPalindromeCheck(String input) {
		int i = 0;
		int j = input.length()-1;
		
		while (i <j) {
			if (input.charAt(i) != input.charAt(j)) {
				return "Not Palindrome";
			}
			i++;j--;
		}
		return " String Palindrome";
	}

}
