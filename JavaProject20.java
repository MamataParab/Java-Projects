//////////////////////////////////////////////////////////////////////////
//
// Project:  Displaying even number from given range  
// Input:    20     30                      
// Output:   20,22,24,26,30
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class EvenRange
{
	public void DisplayEvenNum(int iStart,int iEnd)
	{
		
		int i=0;
		
		for(i=iStart;i<=iEnd;i++)
		{
			if((i%2)==0)
			{
				System.out.print(i+"\t");
			}
		}
		
		
	}
}

class JavaProject20
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		EvenRange eobj=new EvenRange();
		
		int iValue1=0;
		int iValue2=0;
		
		System.out.println("Enter the starting value of range");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the ending value of range");
		iValue2=sobj.nextInt();
		

		eobj.DisplayEvenNum(iValue1,iValue2);
		
	}
}
		
		