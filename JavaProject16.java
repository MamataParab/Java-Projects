////////////////////////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Simple Interest     
// Input:   Principle amount=2500,Time=2 years,Rate of interest=2                         
// Output:  100    
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleInterest
{
	public float CalcInterest(int PrincipleAmt,int Time,int Rate)
	{
		float SI=0.0f;
		SI= (PrincipleAmt * Time * Rate)/100;
		return SI;
	}
}

class JavaProject16
{
	public static void main(String arg[])
	{
		SimpleInterest siobj=new SimpleInterest();
		Scanner sobj=new Scanner(System.in);
		int P=0;
		int T=0;
		int R=0;
		float Ret=0.0f;
		
		System.out.println("Enter the principle amount");
		P=sobj.nextInt();
		
		System.out.println("Enter the time");
		T=sobj.nextInt();
		
		System.out.println("Enter the rate");
		R=sobj.nextInt();
		
		Ret=siobj.CalcInterest(P,T,R);
		System.out.println("Simple interest of given amount is "+Ret);
	}
}
		
		
		