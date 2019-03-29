////////////////////////////////////////////////////////////////////////
//
// Project:  Printing pattern 
// Input:    4                      
// Output:   * * * * # # # #
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Pattern
{
	public void ShowPattern1(int iNo)
	{
		int i=0;
		for(i=0;i<iNo;i++)
		{
			System.out.print("*\t");
		}
		for(i=0;i<iNo;i++)
		{
			System.out.print("#\t");
		}
	}
}

class JavaProject32
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Pattern pobj=new Pattern();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		pobj.ShowPattern1(iValue);
		
	}
}
		