////////////////////////////////////////////////////////////////////////
//
// Project:  Addition of all elements in range
// Input:    10   15                    
// Output:   10+11+12+13+14+15 = 75
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.lang.*;

class Number
{
	int SumRange(int iStart, int iEnd)
	{
		int iSum=0;
		int i=0;
		
		for(i=iStart;i<=iEnd;i++)
		{
			iSum=iSum+i;
		}
		return iSum;
		
	}
}

class JavaProject39
{
	public static void main(String arg[]) throws Exception
	{
		Number nobj=new Number();
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(iobj);
		
		int Value1=0;
		int Value2=0;
		
		int Ret=0;
		
		System.out.println("Enter a starting number");
		Value1= Integer.parseInt(br.readLine());
		
		System.out.println("Enter a ending number");
		Value2= Integer.parseInt(br.readLine());
		
		Ret= nobj.SumRange(Value1,Value2);
		
		System.out.println("Sum of range of given numbers is "+ Ret);
	}
	
}
			
		
		
				
		