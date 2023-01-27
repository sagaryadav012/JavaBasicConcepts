package com.java;

public class AsciiValues 
{
   public static void main(String args[])
   {
	   for(int i=0;i<128;i++)
	   {
		   char c = (char)i; // It converts int to char
		   System.out.println(c);
		   
		   // OR
		   
		   // ASCII Values, ASCII : American Standard Code For Information Interchange
		   System.out.printf("%d : %c",i,i);
	   }
   }
}
