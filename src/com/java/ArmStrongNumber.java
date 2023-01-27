package com.java;

/*
 * Arm Strong numbers = 153,370,371
 *   153 = 1*1*1 + 5*5*5 + 3*3*3
 *       = 1+125+27 = 153
 */


public class ArmStrongNumber 
{
   public static void main(String args[])
   {
	   int n = 153;
	   
	   if(isArmStrong(n))
		   System.out.println(n+" is Arm Strong Number");
	   else
		   System.out.println(n+" is not an Arm Strong Number");
   }
   public static boolean isArmStrong(int n)
   {
	   int r=0,s=0;
	   int num = n;
	  
	   while(n>0)
	   {
		   r = n%10;
		   n = n/10;
		   s += r*r*r; 
	   }
	   
	   System.out.println(s);
	   
	   if(num==s)
		   return true;
	   
	   
	   return false;
   }
}
