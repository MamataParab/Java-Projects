////////////////////////////////////////////////////////////////////////
//
// Project:  Multiplying digit of given number  
// Input:    712                      
// Output:   14
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public int DigitMult(int iNo)
	{
		int iMul=1;
		int iDigit=0;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iMul=iMul*iDigit;
			iNo=iNo/10;
		}
		return iMul;
	}
}

class JavaProject23
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number nobj=new Number();
		
		int iValue=0;
		int Ret=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		Ret=nobj.DigitMult(iValue);
		System.out.println("Multiplication of digit is "+ Ret);	
	}
}
		
		