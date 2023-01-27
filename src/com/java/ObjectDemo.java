package com.java;

public class ObjectDemo 
{
   int num1;
   int num2;
   int result=0;
   public void add()
   {
	   result = num1+num2;
	   System.out.println(result);
   }
   public void sub()
   {
	   result = num1-num2;
	   System.out.println(result);
   }
   public void mul()
   {
	   result = num1*num2;
	   System.out.println(result);
   }
   
   
   public static void main(String args[])
   {
	   // Creating Object here
	   ObjectDemo obj1 = new ObjectDemo();  // Obj1 is reference and new ObjectDemo is Object created in heap memory
	   obj1.num1 = 33;  // Initializing values
	   obj1.num2 = 10;
	   
	   obj1.add();  // Calling methods using object instance
	   obj1.sub();
	   obj1.mul();
   }
}
