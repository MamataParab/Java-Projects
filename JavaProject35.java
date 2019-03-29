////////////////////////////////////////////////////////////////////////
//
// Project:  Area of circle
// Input:    4.2                     
// Output:   55.38
//                                     
////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

class Area
{
	public float Circle(double Radius)
	{
		double Result=0.0;
		Result=3.14*Radius*Radius;
		return Result;
	}
}

class JavaProject34
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Area aobj=new Area();
		
		double Value=0.0;
		double Ret=0.0;
		
		System.out.println("Enter the number");
	    Value=sobj.nextDouble();
		

		Ret=aobj.Circle(Value);
		System.out.println("Area of circle is "+Ret);
		
	}
}
		

