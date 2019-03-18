//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing common factors of two numbers on screen         
// Input:   12 ,18                               
// Output:  1,2,3,6
//                                     
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Factor
{
	public void CommonFactor(int iNo1,int iNo2)
	{
		int i=0;
		for(i=1;((i<=iNo1/2)&&(i<=iNo2/2));i++)
		{
			if(((iNo1%i)==0)&&((iNo2%i)==0))
			{
				System.out.print(i+"\t");
			}
		}
	}
}

class JavaProject9
{
	public static void main(String arg[])
	{
		Factor fobj=new Factor();
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0;
		int iValue2=0;
		
		System.out.println("Enter first number");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter second number");
		iValue2=sobj.nextInt();
		
		fobj.CommonFactor(iValue1,iValue2);
	}
}

