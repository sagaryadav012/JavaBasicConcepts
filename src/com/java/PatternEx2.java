package com.java;

/*
 *    1 2 3 4
 *    2 3 4 1
 *    3 4 1 2
 *    4 1 2 3
 *    
 *    1
 *    0 1
 *    1 0 1
 *    0 1 0 1
 *    1 0 1 0 1
 *  
 *     1
 *     2 2 
 *     3 3 3
 *     4 4 4 4
 *     5 5 5 5 5
 * 
 * */

public class PatternEx2 
{
    public static void main(String args[])
    {
    	// Pattern 1
    	for(int i=1;i<=4;i++)
    	{
    		int k=i;
    		for(int j=1;j<=4;j++)
    		{
    			if(k>4)
    				k=1;
    			System.out.print(" "+k);
    			k++;
    		}
    		System.out.println();
    	}
    	
    	System.out.println("\n "); // for new line
    	
    	// Pattern 2
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			if((i+j)%2==0)
    				System.out.print(" 1");
    			else
    			    System.out.print(" 0");
    		}
    		System.out.println();
    	}
    	
    	System.out.println("\n "); // for new line
    	
    	// Pattern 3
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			    System.out.print(" "+i);
    		}
    		System.out.println();
    	}
    }
}
