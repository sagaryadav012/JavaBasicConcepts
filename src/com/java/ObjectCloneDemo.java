package com.java;

public class ObjectCloneDemo 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Exmp obj1 = new Exmp();
	    obj1.i = 22;
	    obj1.j = 33;
	    
	    Exmp obj2 = (Exmp) obj1.clone();
	    
	    // Changing j value initially it is 33(copied from first object)
	    obj2.j = 44;
	    
	    System.out.println(obj1);
	    System.out.println(obj2);
	}
    
}
class Exmp implements Cloneable
{
	int i,j;

	@Override
	public String toString() {
		return "Exmp [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();  // Every class extends Object class, It calls super class clone method
	}
}