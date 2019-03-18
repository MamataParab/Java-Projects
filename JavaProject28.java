///////////////////////////////////////////////////////////////////////
//
// Project:  Displaying digit that are greater than 5 
// Input:    725439                      
// Output:   2
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int GreaterThan5(int iNo)
	{
		int iDigit=0;
		int iCnt=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit>5)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}

class JavaProject28
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number gobj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=gobj.GreaterThan5(iValue);
		System.out.println("Number of digit those greater than 5 are "+ Ret);	
	}
}
		
		