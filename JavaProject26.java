////////////////////////////////////////////////////////////////////////
//
// Project:  Converting numeric to words value of each digit 
// Input:    231                      
// Output:   one three two 
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
	public void DisplayInWords(int iNo)
	{
		int iCnt=0;
		int iDigit=0;
		
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			switch(iDigit)
			{
				case 0:
					System.out.print("zero"+"\t");
					break;
				
				case 1:
					System.out.print("one"+"\t");
					break;
				
				case 2:
					System.out.print("two"+"\t");
					break;
					
				case 3:
					System.out.print("three"+"\t");	
					break;
					
				case 4:
					System.out.print("four"+"\t");
					break;

				case 5:
					System.out.print("five"+"\t");
					break;
					
				case 6:
					System.out.print("six"+"\t");
					break;
				
				case 7:
					System.out.print("seven"+"\t");	
					break;
				
				case 8:
					System.out.print("eight"+"\t");	
					break;
				
				case 9:
					System.out.print("nine"+"\t");
					break;

				default:
					System.out.print("Invalid input");	
					break;
			}					
			iNo=iNo/10;
		}
	}
}

class JavaProject26
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Number nobj=new Number();
		
		int iValue=0;
		
		System.out.println("Enter the number");
		iValue=sobj.nextInt();
		

		nobj.DisplayInWords(iValue);
			
	}
}
		
		