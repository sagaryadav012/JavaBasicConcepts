package com.java;

/*
 * 0 1 1 2 3 5 8 13 21 34     Fibonacci Series
 * 
 * */

public class FibonacciSeries 
{
   public static void main(String args[])
   {
	   int p=0,q=1;
	   System.out.print(p+" "+q);
	   
	   int k=0;
	   
	   int num = 23;
	   
	   while(k<num)
	   {
		   k = p+q;
		   p = q;
		   q = k;
		   
		   if(k>num)
			   break;
		   
		   System.out.print(" "+k); 
	   }
	     
	   
   }
}
