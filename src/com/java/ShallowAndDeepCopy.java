package com.java;

/*Shallow copy means It doesn't copy whole data it copies reference of 
  the object(already in heap memory)
  
  In Shallow copy if modify any changes in first object it reflects on another other object
  which is pointing to this object

  Deep copy means copying all data not reference of old object
*/
class SD
{
	int i,j;

	@Override
	public String toString() {
		return "SD [i=" + i + ", j=" + j + "]";
	}
	
}
public class ShallowAndDeepCopy 
{
   public static void main(String agrs[])
   {
	   SD obj1 = new SD();
	   obj1.i = 4;
	   obj1.j = 9;
	   
	   // Shollow copy
	     SD obj2 = obj1;
	     obj1.j = 10;  // changed j value of obj1 but it reflects on obj2.j

       // Deep copy
	     SD obj3 = new SD();
	     obj3.i = obj1.i;
	     obj3.j = obj1.j;
	     
	     obj1.i = 20; // changed obj1.i but it not reflects on obj3.i
	   
	   System.out.println(obj1);
	   System.out.println(obj2);
	   System.out.println(obj3);
   }
}
