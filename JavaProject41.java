////////////////////////////////////////////////////////////////////////
//
// Project:  Display type of character
// Input:    a                    A                  6                  		
// Output:   Small character     Capital character   Digit
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.lang.*;

class Number
{
	public void CharType(char ch)
	{
		if((ch>=65)&&(ch<=90))
		{
			System.out.println("It is capital character");
		}
		else if((ch>=97)&&(ch<=122))
		{
			System.out.println("It is small character");
		}
		else if((ch>=49)&&(ch<=57))
		{
			System.out.println("It is digit");
		}
		else
		{
			System.out.println("It is special symbol");
		}
	}
}
			
		
			
		

class JavaProject40
	{
		public static void main(String arg[]) throws Exception
		{
			
			char cValue='\0';
			Scanner sobj=new Scanner(System.in);
			
			Number nobj=new Number();
			
			System.out.println("Enter character");
			cValue=sobj.next().charAt(0);
			
			nobj.CharType(cValue);
			
			
		}
	}