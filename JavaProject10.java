//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing largest common factors of two numbers on screen         
// Input:   12 ,18                               
// Output:  6
//                                     
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Factor
{
	public void CommonFactor(int iNo1,int iNo2)
	{
		if(iNo1<0)
		{
			iNo1=-iNo1;
		}
		if(iNo2<0)
		{
			iNo2=-iNo2;
		}
		
		
		int i=0;
		if(iNo1<iNo2)
		{
			for(i=iNo1/2;((i<=iNo1/2)&&(i<=iNo2/2));i--)
			{
				if(((iNo1%i)==0)&&((iNo2%i)==0))
				{
					System.out.print("Largest common factor is "+i);
					break;
				}
			}
		}
		
		else if(iNo2<iNo1)
		{
			for(i=iNo2/2;((i<=iNo1/2)&&(i<=iNo2/2));i--)
			{
				if(((iNo1%i)==0)&&((iNo2%i)==0))
				{
					System.out.println("Largest common factor is "+i);
					break;
				}
			}
		}
		
		else
		{
			System.out.println("Enter proper input");
		
		}
		
	}
}

class JavaProject10
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

