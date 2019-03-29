////////////////////////////////////////////////////////////////////////
//
// Project:  Checking number is Armstrong or not
// Input:    153                     
// Output:   (1*1*1)+(5*5*5)+(3*3*3)=153 yes
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.lang.*;

class Number
{
	boolean ChkArmStrong(int iNo)
	{
		int iSum=0;
		int Prod=1;
		int iDigit=0;
		int i=0;
		int iCount=0;
		
		int iValue=iNo;
		
		while(iNo!=0)
		{
			iNo=iNo/10;
			iCount++;
		}
			
		iNo=iValue;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			for(i=1;i<=iCount;i++)
			{
				Prod=Prod*iDigit;
			}
			iSum=iSum+Prod;
			Prod=1;
			iNo=iNo/10;
			
		}
		if(iSum==iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class JavaProject38
{
	public static void main(String arg[]) throws Exception
	{
		Number nobj=new Number();
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(iobj);
		
		int Value=0;
		boolean Bret=true;
		
		System.out.println("Enter a number");
		Value= Integer.parseInt(br.readLine());
		
		Bret= nobj.ChkArmStrong(Value);
		
		if(Bret==true)
		{
			
			System.out.println("The given number is Armstrong number");
		}
		else
		{
			System.out.println("The given number is not Armstrong number");
		}
	}
}
			
		
		
				
		