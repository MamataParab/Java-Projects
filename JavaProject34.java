////////////////////////////////////////////////////////////////////////
//
// Project:  Area of square
// Input:    4.2                     
// Output:   17.64
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Area
{
	public float SArea(float iNo)
	{
		float Result=0.0f;
		Result=iNo*iNo;
		return Result;
	}
}

class JavaProject34
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Area aobj=new Area();
		
		float Value=0.0f;
		float Ret=0.0f;
		
		System.out.println("Enter the number");
	    Value=sobj.nextFloat();
		

		Ret=aobj.SArea(Value);
		System.out.println("Area of square is "+Ret);
		
	}
}
		

