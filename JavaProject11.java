////////////////////////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Changing the case of character         
// Input:   A                               
// Output:  a
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Character
{
	public char ChangeCase(char ch)
	{
		int temp=0;
		if((ch>='A')&&(ch<='Z'))
		{
			temp=(int)ch;
			temp=temp+32;
			ch=(char)temp;
			return ch;
		}
		else if((ch>='a')&&(ch<='z'))
		{
			temp=(int)ch;
			temp=temp-32;
			ch=(char)temp;
			return ch;
		}
	}
}

class JavaProject11
{
	public static void main(String arg[])
	{
		Character cobj=new Character();
		Scanner sobj=new Scanner(System.in);
		
		char cValue='\0';
		char Ret='\0';
		
		System.out.print("Enter the character\n");
		cValue=sobj.next().charAt(0);
		
		Ret=cobj.ChangeCase(cValue);
		System.out.println(Ret);
	}
}