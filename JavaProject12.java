////////////////////////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Fibonacci series         
// Input:   9                              
// Output:  1 1 2 3 5 8 13 21 34
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Fibonacci
{
	public void DisplayFibo(int iValue)
	{
	
	    int iSum=0;
		int iNo1=1;
		int iNo2=1;
		int i=0;
		
		System.out.print(iNo1+"\t");
		System.out.print(iNo2+"\t");
		
		for(i=iNo1;i<=(iValue-2);i++)
		{
			iSum=iNo1+iNo2;
			System.out.print(iSum+"\t");
			
			iNo1=iNo2;
			iNo2=iSum;
		}
	}
}

class JavaProject12
{
	public static void main(String arg[])
	{
		Fibonacci fobj=new Fibonacci();
		Scanner sobj=new Scanner(System.in);
		
		int iNo=0;
		System.out.println("Enter the number");
		iNo=sobj.nextInt();
		
		fobj.DisplayFibo(iNo);
	}
}
		
			
		