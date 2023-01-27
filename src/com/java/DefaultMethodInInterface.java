package com.java;


interface P 
{
	default void show()
	{
		System.out.println("In P  show");
	}
}
interface K
{
   default void show()
   {
	   System.out.println("In K  show");
   }
}

class L implements P,K   // Achieve Multiple inheritance
{
	public void show()
	{
		System.out.println("In L show");
	}
}

public class DefaultMethodInInterface  
{
    public static void main(String args[])
    {
    	L l = new  L();
    	l.show();
    }
}
