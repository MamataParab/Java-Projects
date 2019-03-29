////////////////////////////////////////////////////////////////////////
//
// Project:  Checking number is strong or not
// Input:    145                     
// Output:   1!+4!+5!= 145 yes
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.lang.*;

class Number
{
	boolean ChkStrong(int iNo)
	{
		int iSum=0;
		int iFact=1;
		int iDigit=0;
		int i=0;
		
		int iValue=iNo;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			for(i=1;i<=iDigit;i++)
			{
				iFact=iFact*i;
			}
			iSum=iSum+iFact;
			iFact=1;
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

class JavaProject37
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
		
		Bret= nobj.ChkStrong(Value);
		
		if(Bret==true)
		{
			
			System.out.println("The given number is strong");
		}
		else
		{
			System.out.println("The given number is not strong");
		}
	}
}
			
		
		
				
		