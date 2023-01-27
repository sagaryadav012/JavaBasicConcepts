package com.java;

public class SwitchStatement 
{
	public static void main(String args[])
	   {
		   String stateName = "Telangana";  
		   
		   // switch statement executes one statement from multiple conditions
		   
		   switch(stateName)    
		   {
		     case "Karnataka" :System.out.println("Bangalore is capital of "+stateName);
		     break;
		     
		     case "Telangana" :System.out.println("Hyderabad is capital of "+stateName);
		     break;
		     
		     case "Maharashtra" :System.out.println("Mumbai is capital of "+stateName);
		     break;
		     
		     case "Goa" :System.out.println("Panaji is capital of "+stateName);
		     break;
		     
		     default :          
		    	 System.out.println("Nothing found");
		    	 break;
		      
		   }
	   }
}
