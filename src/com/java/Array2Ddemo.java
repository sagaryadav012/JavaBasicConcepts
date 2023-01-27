package com.java;

public class Array2Ddemo 
{
   public static void main(String args[])
   {
	   String names[][] = {
			   {"India", "USA", "UAE", "UK", "Australia"},
               {"Delhi", "Washigton DC", "Saudhi", "Lodnon", "Melbournie"}
          };

		for(String countries[] : names) // For every iteration it takes one array from names array
		{
				for(String capital : countries) // For every iteration it prints string from countries
				    System.out.print(capital+" ");
				System.out.println();
		}
   }
}
