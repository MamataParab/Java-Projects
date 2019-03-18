////////////////////////////////////////////////////////////////////////
//
// Project:  Adding all numbers from given range  
// Input:    20     30                      
// Output:   275
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class AdditionRange
{
	public int DisplayAdd(int iStart,int iEnd)
	{
		
		int i=0;
		int iSum=0;
		
		for(i=iStart;i<=iEnd;i++)
		{
			iSum=iSum+i;
		}
		return iSum;	
	}
}

class JavaProject21
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		AdditionRange aobj=new AdditionRange();
		
		int iValue1=0;
		int iValue2=0;
		int Ret=0;
		
		System.out.println("Enter the starting value of range");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the ending value of range");
		iValue2=sobj.nextInt();
		

		Ret=aobj.DisplayAdd(iValue1,iValue2);
		System.out.println("Addition of given range is "+Ret);
		
	}
}
		
		