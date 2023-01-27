package com.java;

public class ForLoop 
{
   public static void main(String args[])
   {
	   // For loop contains initialization, condition, increment
	   for(int i=1;i<=5;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
	   
	   
	   System.out.println("\n ");
	   
	   for(int i=1;i<=5;i++)
	   {
		   for(int j=5;j>=i;j--)
		   {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
   }
}
