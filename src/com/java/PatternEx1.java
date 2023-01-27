package com.java;

/* 		* * * *      *         * * * *
   		* * * *      * *       *     *
   		* * * *      * * *     *     *
   		* * * *      * * * *   * * * *
 */

public class PatternEx1 
{
   public static void main(String args[])
   {
	   // pattern 1
	   for(int i=1; i<=4; i++)
	   {
		   for(int j=1; j<=4 ;j++)
		   {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
	   
	   System.out.println("\n ");  // For new line
	   
	   // pattern 2
	   for(int i=1; i<=4; i++)
	   {
		   for(int j=1; j<=i ;j++)
		   {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
	   
	   System.out.println("\n ");  // For new line
	   
	   // pattern 3
	   for(int i=1; i<=4; i++)
	   {
		   for(int j=1; j<=4 ;j++)
		   {
			   if(i==1 || i==4 || j==1 || j==4)
				   System.out.print(" *");
			   else
			       System.out.print("  ");
		   }
		   System.out.println();
	   }
   }
}
