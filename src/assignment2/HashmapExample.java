package assignment2;

import java.util.HashMap;

public class HashmapExample {
	public static void main(String args[])
	{
		HashMap<String, Character> Students = new HashMap<> ();
		Students.put("Pavan",'A');
		Students.put("Sai",'B');
		Students.put("Ram",'C');
		Students.put("Shyam",'D');
		Students.put("Kalyan",'E');
		Students.put("Harsha",'F');
		Students.put("Satwik",'G');
		
		
		System.out.println("Original Hashmap is "+ Students);
		
		Character value = Students.remove("Harsha");
	    System.out.println("Removed value: " + value);

	    System.out.println("Updated HashMap: " + Students);
		
		
		

	}

}
