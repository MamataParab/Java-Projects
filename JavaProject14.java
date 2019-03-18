////////////////////////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Converting case of character      
// Input:   A      i                           
// Output:  a      I     
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Character
{
	public void CharSwap(char ch1,char ch2)
	{
		System.out.println("Characters before swap are");
		System.out.print(ch1+"\t");
		System.out.print(ch2);
		
		char temp='\0';
		temp=ch1;
		ch1=ch2;
		ch2=temp;
		
		System.out.println("\nCharacters after swap are");
		System.out.print(ch1+"\t");
		System.out.print(ch2);
	}
}

class JavaProject14
{
	public static void main(String arg[])
	{
		Character cobj=new Character();
		Scanner sobj=new Scanner(System.in);
		char ch1='\0';
		char ch2='\0';
		System.out.println("Enter first character");
		ch1=sobj.next().charAt(0);
		
		System.out.println("Enter second character");
		ch2=sobj.next().charAt(0);
		
		
		cobj.CharSwap(ch1,ch2);
		
	}
}
			
			
