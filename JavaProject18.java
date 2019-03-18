/////////////////////////////////////////////////////////////////////////
//
// Project: Calculating circumference  
// Input:   Radius as 3                        
// Output:  18.84   
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Circumference
{
	public float CalCircum(float Radius)
	{
		float Circum=0.0f;
		float Pi=3.14f;
		
		
		Circum= 2*Pi*Radius;
		return Circum;
	}
}

class JavaProject18
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Circumference cobj=new Circumference();
		
		float fRad=0.0f;
		float Ret=0.0f;
		
		System.out.println("Enter the radius of circle");
		fRad=sobj.nextFloat();
		

		Ret=cobj.CalCircum(fRad);
		System.out.println("The circumference is "+Ret);
	}
}
		
		