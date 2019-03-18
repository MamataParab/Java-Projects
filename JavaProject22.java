////////////////////////////////////////////////////////////////////////
//
// Project:  Reversing elements of given range  
// Input:    20     30                      
// Output:   30,29,28,27,26,25,24,23,22,21,20
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseRange
{
	public void DisplayRev(int iStart,int iEnd)
	{
		int i=0;
		
		
		for(i=iEnd;i>=iStart;i--)
		{
			System.out.print(i+"\t");	
		}
	}
}

class JavaProject22
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		ReverseRange robj=new ReverseRange();
		
		int iValue1=0;
		int iValue2=0;
		
		System.out.println("Enter the starting value of range");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the ending value of range");
		iValue2=sobj.nextInt();
		

		robj.DisplayRev(iValue1,iValue2);
		
		
	}
}
		
		