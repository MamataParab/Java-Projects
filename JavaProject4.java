//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Checking that given number is divisible by 5          
// Input:   525                                  
// Output:  True   
//                                     
////////////////////////////////////////////////////

import java.io.*;
import java.lang.*;
import java.util.*;


class Division
{
	public boolean ChkDivisionBy5(int iNo) 
	{
		if(iNo<0)
		{
			System.out.println("Enter valid input");
			return false;
		}
		
		if((iNo%5)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class JavaProject4
{
	public static void main(String arg[])
	{
		Division dobj=new Division();
		boolean Bret=true;
		int iValue=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Checking that given number is divisible by 5");
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		
		Bret=dobj.ChkDivisionBy5(iValue);
		
		if(Bret==true)
		{
			System.out.println("Given number is divisible by 5");
		}
		else
		{
			System.out.println("Given number is not divisible by 5");
		}
	}
}

		
		
		