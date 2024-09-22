
// Write a java program to given uncheck exception

// 4.2 (a) NullPointerException before handling


public class Assignment4_2_a 
{
   
	int pinNo = 400024;
	
	public static void main(String[] args) 
	{
		Assignment4_2_a as = new Assignment4_2_a ();
		as = null;
		System.out.println ("PIN number is : " + as.pinNo);
		
		 
	}

}
