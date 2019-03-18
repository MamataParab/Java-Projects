//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing * on screen          
// Input:   10                                 
// Output:  * * * * * * * * * *   
//                                     
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.util.*;

class Print
{
	public void DisplayPattern(int iNo)
	{
		int i=0;
		for(i=0;i<iNo;i++)
		{
			System.out.print("*\t");
		}
	}
}

class JavaProject5
{
	public static void main(String arg[])
	{
		Print pobj=new Print();
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		
		System.out.println("Printing * on screen");
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		
		pobj.DisplayPattern(iValue);
	}
}

		