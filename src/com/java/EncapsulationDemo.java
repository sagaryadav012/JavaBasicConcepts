package com.java;

import static java.lang.System.out; // used static import

/*      Encapsulation in Java is a process of wrapping code and data together into a single unit.

		The Java Bean class is the example of a fully encapsulated class.
		
		By providing only a setter or getter method, you can make the class read-only or write-only
		
		It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
*/


class Emp
{
	private int Id;
	private String name;
	
	public void setID(int Id)
	{
		this.Id = Id;
	}
	public int getId()
	{
		return this.Id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}

public class EncapsulationDemo 
{
	public static void main(String...args)
    {
   	 Emp obj1 = new Emp();
   	 obj1.setID(559);
   	 obj1.setName("Sagar Yadav");
   	 
   	 Emp obj2 = new Emp();
   	 obj2.setID(548);
   	 obj2.setName("Sharath Goud");
   	 
   	 out.println(obj1.getId()+" : "+obj1.getName());
   	 out.println(obj2.getId()+" : "+obj2.getName());
   	 
    }
}
