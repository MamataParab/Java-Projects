//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing Even number on screen         
// Input:   12                                
// Output:  1,2,3,4,6
//                                     
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Factor
{
	public void FactorDisplay(int iNo)
	{
		int i=0;
		for(i=1;i<=iNo/2;i++)
		{
			if((iNo%i)==0)
			{
				System.out.print(i+"\t");
			}
		}
	}
}

class JavaProject8
{
	public static void main(String arg[])
	{
		Factor fobj=new Factor();
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		
		fobj.FactorDisplay(iValue);
	}
}

			