package com.java;

public class ConstructorDemo 
{
	// Note : Constructor doesn't have return Type
   public ConstructorDemo()   // Default Constructor, JVM creates it Even If we not mention at time of execution
   {
	  System.out.println("In Default Constructor"); 
   }
   public ConstructorDemo(int i)   // Override Constructor 
   {
	   System.out.println("In Int Type Constructor");
   }
   public ConstructorDemo(double i)   // Override Constructor
   {
	   System.out.println("In Double Type Constructor");
   }
   public static void main(String args[])
   {
	   
	   ConstructorDemo cd = new ConstructorDemo(); // it calls the default constructor
	   ConstructorDemo cd1 = new ConstructorDemo(9.7); // it calls  Double Type constructor
	   ConstructorDemo cd2 = new ConstructorDemo(5); // it calls Int Type constructor 
   }
}
