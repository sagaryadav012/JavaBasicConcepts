package com.java;

/*
Throwable
          - Exception
                      - Checked : IOException, SQLException
                      - Unchecked : RuntimeExcpetion : ArithmaticException, IndexOutOfBoundException
          - Error 

*/

public class ExceptionDemo
{
	 public static void main(String args[])
	   {
		   int i=8,j=2,k=0;
		   
		   int[] nums = {4,5,2,7,8}; // capacity 5
		   
			   try 
			   {
				  // k = i/k;  // Dividing 8/0 throws ArithmeticException 
				   
				   for(int x=0;x<=5;x++);  // Fetching values from 0 index to 5 index, but capacity is 5(starts from 1) only.
				   {
					   System.out.println(nums[i]);  // throws ArrayIndexOutOfBoundsException
				   }
			   }
			   catch(ArithmeticException ae)
			   {
				   System.out.println("Can't divide By Zero");
			   }
			   catch(ArrayIndexOutOfBoundsException ae)
			   {
				  System.out.println("Out Of Space"); 
			   }
			   finally  // This block will be executed finally even exception occurred
			   {
				   System.out.println("Finally Block");
			   }
		   
	   }
}
