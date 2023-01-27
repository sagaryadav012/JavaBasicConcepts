package com.java;

public class TernaryOperatorExm 
{
    public static void main(String args[])
    {
    	int age = 14;
    	String Mj= "Major";
    	String Mi= "Minor";
    	String Sc = "Senior Citizen";
    	
    	String result = age>=60?Sc:age>=18?Mj:Mi;
    	
    	System.out.println(result);
    }
}
