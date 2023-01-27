package com.java;

/*Inheritance in Java is a mechanism in which one object acquires all the properties and 
behaviors of a parent object.*/

public class InhertianceDemo
{
	public static void main(String...args)
	{
		 A b = new B();
		 b.abc();
	} 
}

class A
{
	int i=8;    // instance variable
	void abc()
	{
		System.out.println("In A class abc method");
	}
}
class B extends A
{
	int i =9;
	void abc()   // overriding super class method
	{
		super.i = 7;  // super class variable
		super.abc();  // invoking super class method
		System.out.println("In B class abc method "+i);  // Here i is B's instance variable
	}
}
