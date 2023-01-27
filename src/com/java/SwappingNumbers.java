package com.java;

public class SwappingNumbers 
{
   public static void main(String args[])
   {
	   int a = 5, b = 3;
	   System.out.println("Before Swap : a="+a+" b="+b);
	   
	   // Example 1
	   int hold = a;
	   a = b;
	   b = hold;
	   System.out.println("After Swap1 : a="+a+" b="+b);
	   
	   // Example 2
	   a = a+b;
	   b = a-b;
	   a = a-b;
	   System.out.println("After Swap2 : a="+a+" b="+b);
	   
	   // Example 3
	            b = (a+b)-(a=b);
	            System.out.println("After Swap3 : a="+a+" b="+b);
   }
}
