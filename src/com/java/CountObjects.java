package com.java;

class ObCount
{
   static int i=0;
	ObCount()
	{
		i++;
		System.out.println(i);
	}
}
public class CountObjects 
{
    public static void main(String args[])
    {
    	ObCount obj1 = new ObCount();
    	ObCount obj2 = new ObCount();
    	ObCount obj3 = new ObCount();
    }
}
