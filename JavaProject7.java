//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing Even number on screen         
// Input:   10                                
// Output:  2,4,6,8,10,12,14,16,18,20
//                                     
////////////////////////////////////////////////////

import java.io.*;
import java.util.*;
import java.lang.*;

class EvenNumber
{
	public void DisplayEven(int iNo)
	{
		int i=0;
		
		if((iNo%2)!=0)
		{
			System.out.println("Invalid input");
			System.out.println("Please enter even number");
			
		}
		
		if((iNo%2)==0)
		{
			for(i=1;i<=iNo;i++)
			{
				System.out.print(i*2+"\t");
			}
		}
	}
}

class JavaProject7
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		EvenNumber eobj=new EvenNumber();
		int iValue=0;
		
		System.out.println("Printing Even number on screen ");
		System.out.println("Enter number");
		iValue=sobj.nextInt();
		
		eobj.DisplayEven(iValue);
	}
}

				