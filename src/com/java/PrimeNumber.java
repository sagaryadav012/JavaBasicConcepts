package com.java;

public class PrimeNumber 
{
   public static void main(String args[])
   {
	   int num = 88;
	   
	   if(isPrime(num))
		   System.out.println(num+" is Prime Number");
	   else
		   System.out.println(num+" is not Prime Number");
   }
   public static boolean isPrime(int num)
   {
	   for(int i=2;i<num;i++)
	   {
		   if(num%i==0 )
			   return false;
	   }
	   return true;
   }
}
