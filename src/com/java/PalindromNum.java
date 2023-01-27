package com.java;

// Palindrom numbers : 121, 353, 434; number should be same from both sides

public class PalindromNum 
{
   public static void main(String args[])
   {
	   int num = 142;
	   if(isPalindrom(num))
		   System.out.println(num+" is Palindrom Number");
	   else
		   System.out.println(num+" is not Palindrom Number");
   }
   public static boolean isPalindrom(int num)
   {
	   int Original = num;
	   int r=0,s=0;
	   
	   while(num>0)
	   {
		   r = num%10; 
		   s = s*10+r;
		   num = num/10;
	   }
	   System.out.println(s);
	   
	   if(Original == s)
		   return true;
	   
	   return false;
   }
}
