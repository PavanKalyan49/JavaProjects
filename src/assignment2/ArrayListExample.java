package assignment2;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<> ();// Initializing and declaring arraylist 
		arr.add(1); // Adding integers in the array
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		int sum=0;
		for(int i=0;i<arr.size();i++)
		{
			sum=sum+arr.indexOf(i); //Sum of integers
		}
		System.out.println("The sum of the given array list is " + sum);
		
	}

}
