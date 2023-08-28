package assignment2;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[])
	{
		LinkedList<String> Rivers = new LinkedList<> ();
		
		Rivers.add("Ganga");
		Rivers.add("Yamuna");
		Rivers.add("Narmada");
		System.out.println("Original Linkedlist is "+ Rivers);
		System.out.println("Length of original array is " + Rivers.size());
		System.out.println( Rivers.get(0));
		LinkedList<String> reversearray = new LinkedList<> ();
	
		for(int i= Rivers.size()-1;i>=0;i--)
		{
			reversearray.add(Rivers.get(i));
		}
		System.out.println("Reversed Linkedlist is "+ reversearray);
		
	  
	}

}
