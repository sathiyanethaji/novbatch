package com.tech;

public class Exceptionhandling2 {
	public static void main(String[] args) {
		try {
			long l=40;
			System.out.println(l/0);
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("result is printed");
		}
		System.out.println("print the result");
		System.out.println("print the result");
		
	}

}
