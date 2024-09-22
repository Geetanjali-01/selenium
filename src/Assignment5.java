
// Write a java Program to implement Multiple Inheritance 

interface Music 
   { public void start (); }

interface Song 
   { public void sing (); }

interface Record extends Song, Music
    { public void track (); }

public class Assignment5 
{
    public static void main(String[] args) 
	 {
		Record rd = new Record ()
		
	    {  public void start ()
			  { System.out.println("Start the music"); } 
				
		    public void sing ()
		      { System.out.println("Sing a song"); }
		
		    public void track ()
		      { System.out.println("Record the track"); } 
	     }; 
	     
	     rd.start();
		 rd.sing();
		 rd.track();			
	}
}
