////////////////////////////////////////////////////////////////////////
//
// Project:  Searching mmallest digit from number  
// Input:    7124                      
// Output:   1
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int SmallestDigit(int iNo)
	{
		int iDigit=0;
		int iSmall=9;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit<iSmall)
			{
				iSmall=iDigit;	
			}	
			iNo=iNo/10;
		}
		return iSmall;
	}
}

class JavaProject31
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number nobj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=nobj.SmallestDigit(iValue);
		System.out.println("Smallest digit of given number is "+ Ret);	
	}
}
		
		