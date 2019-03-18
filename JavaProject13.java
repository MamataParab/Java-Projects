////////////////////////////////////////////////////////////////////////
//
// Author:  Mamata Anil Parab                           
// Project: Checking character is vowel or not       
// Input:   A      i       B                      
// Output:  True   True   False
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Vowel
{
	public boolean ChkVowel(char ch)
	{
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class JavaProject13
{
	public static void main(String arg[])
	{
		Vowel vobj=new Vowel();
		Scanner sobj=new Scanner(System.in);
		char ch='\0';
		boolean Bret=true;
		
		System.out.println("Enter the character");
		ch=sobj.next().charAt(0);
		
		Bret=vobj.ChkVowel(ch);
		
		if(Bret==true)
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}
	}
}
			
			
