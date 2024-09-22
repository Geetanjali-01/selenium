
// Write a java program to given uncheck exception

// 4.1 (b) ArrayIndexOutOfBoundsException after handling using try-catch

import java.util.Scanner;


public class Assignment4_1_b
{

	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter index value between 0 to 5 : ");
		int index = sn.nextInt();
		int arr[] = {10, 20, 30, 40, 50, 60};
		try
		{
		System.out.println(arr[index]);// Entering index value as 30 - ArrayIndexOutOfBoundException
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{ System.out.println("Please provide a valid index value from  0 to 5 only");
		sn.close();
		}

	}
}