package com.java;

public class LabledBreakDemo 
{
   public static void main(String args[])
   {
	   // We can give label name to outerloop 
	   OuterLoop :
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=4;j++)
		   {
			   if(i==3)
				   break OuterLoop;  // Here I am breaking outer loop;
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
   }
}
