////////////////////////////////////////////////////////////////////////
//
// Project:  Counting occurrence of 5  
// Input:    75352551                      
// Output:   3
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int CountingOccurrence(int iNo)
	{
		int iCnt=0;
		int iDigit=0;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit==5)
			{
				iCnt++;
			}	
			iNo=iNo/10;
		}
		return iCnt;
	}
}

class JavaProject25
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number nobj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=nobj.CountingOccurrence(iValue);
		System.out.println("Occurrence of digit 5 is "+ Ret);	
	}
}
		
		