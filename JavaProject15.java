////////////////////////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Factorial      
// Input:   5                         
// Output:  120    
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
	public int DisplayFactorial(int iNo)
	{
		int i=0;
		int iFact=1;
		for(i=1;i<=iNo;i++)
		{
			iFact=iFact*i;
		}
		return iFact;
	}
}

class JavaProject15
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Factorial fobj=new Factorial();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		
		Ret=fobj.DisplayFactorial(iValue);
		System.out.println("The factorial of given number is "+Ret);
	}
}
		