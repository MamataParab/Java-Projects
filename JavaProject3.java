//////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Printing number in reverse order          
// Input:   10,5                                  
// Output:  10,9,8,7,6,5   
//                                     
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class ReversePrint
{
	public void Display(int iNo1,int iNo2)
	{
		int i=0;
		for(i=iNo2;i>=iNo1;i--)
		{
			System.out.println(i);   //Printing data on standard output device(console)
		}
	}
}
		

class JavaProject3
{
	public static void main(String arg[])    //Main function
	{
		ReversePrint robj=new ReversePrint();          // Class object
		Scanner sobj=new Scanner(System.in);  //Scanner object to accept input from user
		
		int i=0;
	
		int iValue1=0;
		int iValue2=0;
		
		System.out.println("Printing number in reverse order ");
		
		System.out.println("Enter starting value");
		iValue1=sobj.nextInt();         //Accepting data from user
  		
		System.out.println("Enter ending value");
		iValue2=sobj.nextInt();         //Accepting data from user
  		
		robj.Display(iValue1,iValue2);               //Function call
		
		
	}
}