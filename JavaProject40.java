////////////////////////////////////////////////////////////////////////
//
// Project:  Display pattern
// Input:    3                   		
// Output:   3 # # # 2 # # 1 #
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.lang.*;

class Number
{
	public void Pattern(int iNo)
	{
		int i=0;
		int j=0;
		
		int k=iNo;
		for(i=iNo;i>0;i--)
		{
			System.out.print(k+"\t");
			k--;
			for(j=i;j>0;j--)
			{
				System.out.print("#"+"\t");
				
			}
		}
	}
		
}

class JavaProject40
	{
		public static void main(String arg[]) throws Exception
		{
			InputStreamReader iobj=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(iobj);
			
			int iValue=0;
	
			int Ret=0;
			
			Number nobj=new Number();
			
			System.out.println("Enter the number");
			iValue=Integer.parseInt(br.readLine());
			
			nobj.Pattern(iValue);
			
			
		}
	}