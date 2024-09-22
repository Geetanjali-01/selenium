
// Write a java program to given uncheck exception

// 4.1 (a) ArrayindexOutOfBoudExcepttion before handling


import java.util.Scanner;


public class Assignment4_1_a
{

public static void main(String[] args) 
{
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter index value between 0 to 5 : ");
	int index = sn.nextInt();
	int arr[] = {10, 20, 30, 40, 50, 60};
	System.out.println(arr[index]);
	sn.close();
	

}

} 