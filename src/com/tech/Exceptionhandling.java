package com.tech;

public class Exceptionhandling {
public static void main(String[] args) {

		try {
			int a=8;
			System.out.println(a/0);
		}
		catch (Exception e) 
		{
		
			e.printStackTrace();
			//or
			System.out.println(e);
		}
		
	
	System.out.println("print the number");
	
	
}
}
