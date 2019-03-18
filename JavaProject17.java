///////////////////////////////////////////////////////////////////////
//
// Project: Average   
// Input:   3 as 10,11,12                        
// Output:  11    
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Average
{
	public float CalcAvg(int Arr[])
	{
		int iSum=0;
		float Avg=0.0f;
		int i=0;
		
		for(i=0;i<Arr.length;i++)
		{
			iSum=iSum+Arr[i];
		}
		Avg=iSum/Arr.length;
		return Avg;
	}
}

class JavaProject17
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Average aobj=new Average();
		
		int iValue=0;
		float Ret=0;
		int i=0;
		
		System.out.println("Enter the number of elements of array");
		iValue=sobj.nextInt();
		int Arr[]=new int[iValue];
		
		System.out.println("Enter the elements of array");
		
		for(i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		

		Ret=aobj.CalcAvg(Arr);
		System.out.println("The Average of given array is "+Ret);
	}
}
		
		