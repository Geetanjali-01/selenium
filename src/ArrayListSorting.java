
// Write a program to sort the ArrayList in ascending order

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListSorting  
{


	public static void main(String[] args) 
	{
		ArrayList<Integer> n = new ArrayList<Integer> ();
		
		n.add(800);
		n.add(500);
		n.add(100);
		n.add(700);
		n.add(400);
		n.add(900);
		n.add(200);
		n.add(1000);
		n.add(600);
		n.add(300);
		
		System.out.println("Before sort : "+n);
		Collections.sort(n);
		System.out.println("After sorting in Ascending Order : " + n);
		
		
	}

}
