package com.java;

/*
when wxecution starts, JVM executes first static block, static variables later it executes 
main method.
*/
public class StaticBlockDemo 
{
	
   public static void main(String args[])
   {
	   System.out.println("In main method");
   }
   
   static
   {
	   System.out.println("In Static Block");
   }
}
