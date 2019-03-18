////////////////////////////////////////////////////////////////////////
//
// Project:  Adding odd digit of given number  
// Input:    712312                      
// Output:   12
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int AddOddDigit(int iNo)
	{
		int iSum=0;
		int iDigit=0;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if((iDigit%2)!=0)
			{
				iSum=iSum+iDigit;
			}	
			iNo=iNo/10;
		}
		return iSum;
	}
}

class JavaProject30
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number nobj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=nobj.AddOddDigit(iValue);
		System.out.println("Addition of even digit is "+ Ret);	
	}
}
		
		