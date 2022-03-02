package pkg1;

public class Student 
{     // { } this is the boundary of the class

	int a=213;  // we have declared a variable named a
	
	public void deepak()
	{    // { } this the boundary of method
		System.out.println("welcome to all of you");
	}
	public static void main(String[] args) 
	{  // { } this is the boundary of main method
		
		Student pritam=new Student();
		pritam.deepak(); // called the deepak method
	    pritam.deepak(); 
	    System.out.println(pritam.a);
	}


}
