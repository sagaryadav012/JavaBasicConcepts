package com.java;

public class IfElseExample 
{
    public static void main(String args[])
    {
    	int i= 56;
    	if(i%2 == 0)
    		System.out.println(i+ " Is Even Number");
    	else if(i%2 != 0)
    		System.out.println(i+ " Is Odd Number");
    	else
    		System.out.println(i+ " Invalid Number");
    }
}
