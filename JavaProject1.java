//////////////////////////////////////////////////////
// Author: Mamata Anil Parab                           
// Project: Division of two number in java            
//Input: 100,10                                      
//Output:10                                         
////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class DivideNum                                                   
{
	public double Divide(int iNo1,int iNo2)
	{
		double Ans=0.0;
		Ans=iNo1/iNo2;
		return Ans;
	}
}

class JavaProject1
{
	public static void main(String args[])                   // Main method
	{
		
		DivideNum dobj=new DivideNum();                      // Creating the object of class
		Scanner sobj=new Scanner(System.in);                // Creating the object of Scanner class
		
		int Value1=0;
		int Value2=0;
		double Ret=0.0;
		
		printf("Division of two numbers");
		System.out.println("Enter the First number");
		Value1=sobj.nextInt();                             // Accepting first value from user
		
		System.out.println("Enter the Second number");
		Value2=sobj.nextInt();                              // Accepting second value from user
		
		Ret=dobj.Divide(Value1,Value2);                      //Function call
		System.out.println("The division of two number is "+Ret);
		
	}
}
		