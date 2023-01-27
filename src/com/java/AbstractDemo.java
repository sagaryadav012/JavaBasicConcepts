package com.java;

/*	Abstraction is a process of hiding the implementation details and
	showing only functionality to the user.
	
	An abstract class must be declared with an abstract keyword.
	It can have abstract and non-abstract methods.
	It cannot be instantiated.
	It can have constructors and static methods also.
	It can have final methods which will force the subclass not to change the body of the method.
*/
abstract class Ademo
{
	public Ademo()
	{
		
	}
	abstract void show();
	public void display()
	{
		System.out.println("In display method");
	}
	
	final public void Fmethod()
	{
		System.out.println("In Abstract final method");
	}
}
public class AbstractDemo extends Ademo
{
     public static void main(String args[])
     {
    	// Ademo a = new Ademo(); // Cann't instatiate
    	 
    	 Ademo a = new AbstractDemo();
    	 
    	 a.display();
    	 a.show();
    	 
     }

	@Override
	void show() {
		System.out.println("In Abstract demo show method");
		
	}

		// We cannot modify final method of super class
	//	public void Fmethod()
	//	{
	//		
	//	}
}
