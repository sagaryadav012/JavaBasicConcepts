package com.java;

public class PerfectNumber 
{
   public static void main(String args[])
   {
	   int num = 15;
	   if(isPerfect(num))
		   System.out.println(num+" is Perfect Number");
	   else
		   System.out.println(num+" is not Perfect Number");
   }
   public static boolean isPerfect(int num)
   {
	   int sum = 0;
	   
	   for(int i=1;i<num;i++)
	   {
		   if(num%i==0)
			   sum += i;	   
	   }
	  // System.out.println(sum);
	   if(sum==num)
		   return true;
	   
	   return false;
   }
}

