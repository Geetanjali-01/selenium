

// Write a java program to given uncheck exception

// 4.2 (a) NullPointerException after handling using try-catch method



public class Assignment4_2_b 
{

   int pinNo = 400024;
	
	public static void main(String[] args) 
	{
		Assignment4_2_a as = new Assignment4_2_a ();
		try
		{    as = null; // When the object is null - NullpointerException
		System.out.println ("PIN number is : " + as.pinNo);   }
		
		catch (Exception a)
		{   System.out.println ("Please Provide a valid PIN number ");  }
		
	}

}
