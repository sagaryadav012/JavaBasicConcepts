package com.java;

/*The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body.
It cannot be instantiated just like the abstract class.
It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
Since Java 8, we can have default and static methods in an interface.
Since Java 9, we can have private methods in an interface.*/

interface IDemo // Functional Interface
{
	void show();
	default void display()
	{
		System.out.println("In IDemo Display");
	}
	static void Print()
	{
		System.out.println("In IDemo Print");
	}
}
class AExp implements IDemo
{
	public void show()
	{
		System.out.println("In AExp show");
	}
	public void display()
	{
		System.out.println("In AExp display");
	}
}

public class InterfaceDemo 
{
   public static void main(String args[])
   {
	   IDemo id = new AExp();
	   id.show();
	   id.display();  // Overriding method
	   
	   IDemo.Print();  // Calling Print method directly using interface name
	   
		/*
		 * We can't call child class method in interface using parent class reference
		 * That means dynamic method dispatch not works in interface
		 */
	      // id.display();  
   }
}
