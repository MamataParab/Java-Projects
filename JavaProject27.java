////////////////////////////////////////////////////////////////////////
//
// Project:  Displaying number in reverse order 
// Input:    712678                      
// Output:   876217
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int Reverse(int iNo)
	{
		int iRev=0;
		int iDigit=0;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iRev=iRev*10+iDigit;
			iNo=iNo/10;
		}
		return iRev;
	}
}

class JavaProject27
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number robj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=robj.Reverse(iValue);
		System.out.println("Reverse of given number is "+ Ret);	
	}
}
		
		