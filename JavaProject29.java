//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Project:  Difference of addition of even digit and addition of odd digit  
// Input:    712312                      
// Output:   12
//                                     
//////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int DiffOddEvenDigit(int iNo)
	{
		int iEven=0;
		int iOdd=0;
		int iDiff=0;
		int iDigit=0;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if((iDigit%2)==0)
			{
				iEven=iEven+iDigit;
			}
			else
			{
				iOdd=iOdd+iDigit;
			}
			
			iNo=iNo/10;
		}
		iDiff=iEven-iOdd;
		return iDiff;
	}
}

class JavaProject29
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number nobj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=nobj.DiffOddEvenDigit(iValue);
		System.out.println("Difference of even and odd  digit is "+ Ret);	
	}
}
		
		