package com.java;

public class BreakContinueStatements 
{
   public static void main(String args[])
   {
	   // Continue Statement
	   for(int i=1;i<=5;i++)
	   {
		   if(i==3)
			   continue;    // it skips the iteration when i==3;
		   System.out.println(i);
	   }
	   
	   // Break Statement;
	   for(int i=1;i<=5;i++)
	   {
		   if(i==3)
			   break;    // it breaks the loop when i==3;
		   System.out.println(i);
	   }
   }
}
