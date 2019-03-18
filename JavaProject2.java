//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing data in loop           
// Input:   20                                    
// Output:  "Java is Pure Object Oriented Language"
//                                      
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Iterate
{
	public void Display(int iNo)
	{
		int i=0;
		for(i=0;i<iNo;i++)
		{
			System.out.println("Java is Pure Object Oriented Language");   //Printing data on standard output device(console)
		}
	}
}
		

class JavaProject2
{
	public static void main(String arg[])    //Main function
	{
		Iterate iobj=new Iterate();          // Class object
		Scanner sobj=new Scanner(System.in);  //Scanner object to accept input from user
		
		int i=0;
		int iValue=0;
		
		System.out.println("Printing data in loop");
		
		System.out.println("Enter the number of times to iterate the loop");
		iValue=sobj.nextInt();              //Accepting data from user
		iobj.Display(iValue);               //Function call
		
		
	}
}
		
		
