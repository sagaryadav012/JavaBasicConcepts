package com.java;

/*If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A 
relationship.*/

class Employe
{
	int Id;
	String name;
	Address address; // Has A relation
	
	Employe(int Id, String name, Address address)
	{
		this.Id = Id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println(Id+" : "+name+" : "+address.city+" : "+address.pincode);
	}
	
}
class Address
{
	Long pincode;
	String city;
	
	Address(Long pincode, String city)
	{
		this.pincode = pincode;
		this.city = city;
	}
}
public class HasARealtionDemo
{
    public static void main(String...args)
    {
    	Address add1 = new Address(507101l, "Kothagudem");
    	Address add2 = new Address(500001l, "Hyderabad");
    	
    	Employe emp1 = new Employe(559,"Sagar Kumar",add1);
    	Employe emp2 = new Employe(548,"Sharath Goud",add2);
    	
    	
    	emp1.display();
    	emp2.display();
    }
}
