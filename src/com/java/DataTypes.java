package com.java;

public class DataTypes 
{
	 public static void main(String args[])
	   {
		   long l  = 5000l;   // 8 Byte
		   double d = 33;     // 8 Byte
		   float f = 10f;     // 4 Byte
		   int i = 5;		  // 4 Byte
		   short s = 3;		  // 2 Byte
		   byte b = 1;		  // 1 Byte 
		   char c = 'S';	  // 2 Byte
		   boolean state = true; // 1 bit
		   System.out.println(l);
		   System.out.println(d);
		   System.out.println(f);
		   System.out.println(i);
		   System.out.println(s);
		   System.out.println(b);
		   System.out.println(c);
		   System.out.println(state);
		   
		   // TypeCasting 
		   int i1 = s; // Implicit conversion;
		   int i2 = (int)l; // Explicit conversion
		   
	   }
}
