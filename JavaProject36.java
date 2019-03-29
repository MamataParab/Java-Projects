////////////////////////////////////////////////////////////////////////
//
// Project:  Calculating power of number
// Input:    3   4                     
// Output:   3*3*3*3 = 81
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.lang.*;

class Number
{
	public int Power(int iNo1,int iNo2)
	{
		int i=0;
		int Power=1;
		
		for(i=0;i<iNo2;i++)
		{
			Power=Power*iNo1;
		}
		return Power;
	}
}
	
	class JavaProject36
	{
		public static void main(String arg[]) throws Exception
		{
			InputStreamReader iobj=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(iobj);
			
			int iValue1=0;
			int iValue2=0;
			int Ret=0;
			
			Number nobj=new Number();
			
			System.out.println("Enter base of number");
			iValue1=Integer.parseInt(br.readLine());
			
			System.out.println("Enter power of number");
			iValue2=Integer.parseInt(br.readLine());
			
			Ret=nobj.Power(iValue1,iValue2);
			System.out.println("The power of given number is  "+Ret);
			
		}
	}