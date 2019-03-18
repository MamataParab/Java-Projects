/////////////////////////////////////////////////////////////////////////
//
// Project: Converting decimal digit to binary equivalent 
// Input:   10     11                      
// Output:  1010   1011
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Binary
{
	public void Dec2Bin(int iNo)
	{
		int digit=0;
		int arr[]=new int[10];
		int i=0;
		
		while(iNo!=0)
		{
			digit=iNo%2;
			arr[i]=digit;
			i++;
			iNo=iNo/2;
		}
	
		
		for(i=9;i>=0;i--)
		{
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}

class JavaProject19
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Binary bobj=new Binary();
		
		int iValue=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		bobj.Dec2Bin(iValue);
		
	}
}
		
		