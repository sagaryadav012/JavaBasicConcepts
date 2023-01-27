package com.java;

/* VarArgs will be useful when we don't know how many parameters of same data type to be
   passed in method;
   
   Here I used 3 show methods with different parameters but we can take directly one method
   that is show(int...n)
*/

public class VarArgsDemo 
{
   public void show(int a)
   {
	   System.out.println(a);
   }
   public void show(int a, int b)
   {
	   System.out.println(a+" "+b);
   }
   public void show(int a, int b, int c)
   {
	   System.out.println(a+" "+b+" "+c);
   }
   
   public void show(int...n)
   {
	   for(int k : n)                   // used for loop to print values because we dont know how many parameters it has
		   System.out.print(k+" ");
   }
   
   public static void main(String args[])
   {
	   VarArgsDemo vd = new VarArgsDemo();
//	   vd.show(9);
//	   vd.show(6, 9);
//	   vd.show(5, 3, 1);
	   
	   vd.show(9,5,4,6,2,0,1); // It takes no.of parameter with same datatype
   }
}
