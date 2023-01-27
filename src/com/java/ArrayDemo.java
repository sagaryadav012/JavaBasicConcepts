package com.java;

public class ArrayDemo 
{
   public static void main(String args[])
   {
	   // part - 1 : Integer DataType Array
	   int[] nums = new int[4]; // 4 is array capacity
	   // assigning values, index starts from 0
	   nums[0] = 88;
	   nums[1] = 34;
	   nums[2] = 65;
	   nums[3] = 23;
	   
	   for(int num : nums) // printing elements using enhanced for loop
		   System.out.print(num+" ");
	   
	   System.out.println(); // For new line
	   
	   // Part - 2 : Char DataType Array
	   
	   char[] chars = {'A', 'T', 'S', 'M', 'S'}; // We can assign values directly instead of assign one value in one index
	   
	   for(char c : chars)
		   System.out.print(c+" ");
	   
	   System.out.println(); // For new line
	   
	   // Part - 3 : String DataType Array
	   
	   String[] countries = {"India", "USA", "UAE", "UK", "Australia"};
	   
	   for(String countrie : countries)
	     System.out.print(countrie+" ");
   }
}
