package com.java;

/*
	Instance variables declared inside class outside method
	Local variables declared inside method means access level inside method only
	Static variables declared with static keyword
	
	
	In this example, We created two object s1,s2 and for both college name is same. so declared
	college name as static. It won't create two variable objects, creates only one.
	static means it is class variable don't take space in heap.
	
	Instance variables : rollno, name;
	Local variables : r, name;
	static variable : college_name;
	
*/
class Student
{
	int rollno;
	String name;
	static String college_name = "KITE";
	
	Student(int r, String name)
	{
		this.rollno = r;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(name+" : "+rollno+" : "+college_name);
	}
}

public class VariablesDemo 
{
	public static void main(String...args)
	 {
		 Student s1 = new Student(559,"Sagar Kumar");
		 Student s2 = new Student(548, "Sharath Goud");
		 
		 s1.display();
		 s2.display();
	 }
}
