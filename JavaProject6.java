//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing character on screen          
// Input:   A                                 
// Output:  A 
//                                     
////////////////////////////////////////////////////

import java.io.*;
import java.lang.*;
import java.util.*;

class Alphabet
{
	public void DisplayChar(char ch)
	{
		System.out.println("Entered alphabet is "+ch);
	}
}

class JavaProject6
{
	public static void main(String arg[])
	{
		Alphabet aobj=new Alphabet();
		Scanner sobj=new Scanner(System.in);
		char cValue='\0';
		
		System.out.println("Printing character on screen");
		System.out.println("Enter number");
		
		cValue=sobj.next().charAt();
		aobj.DisplayChar(cValue);
	}
}

		
		
		
		
		