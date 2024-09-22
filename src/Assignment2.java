
// Write a Java program to reverse a string with and without reverse() function String Reverse

public class Assignment2 
{
	public static void main(String[] args) 
	{
		//Reverse a string with reverse() function using StringBuilder
		StringBuilder st = new StringBuilder ("I like Java");
		
		System.out.println(st);
		System.out.println("Reverse of "+st+" is: "+st.reverse());
		
		System.out.println("------------------");
		
		System.out.println();
		
		
		
		
		// Reverse a string without reverse () function, using for loop
		
		String sl = "Selenium";
		String result = "";
		
		for (int i=sl.length () - 1; i>=0; i--)
		   
		   {result = result + sl.charAt(i);}
		
		System.out.println("Reverse of "+sl+" is : "+result );
		
	}
}

