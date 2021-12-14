package com.tech;

public class Exceptionhandling3 {
	public static void main(String[] args) {
		int a=7;
		try {
			
			try {
				System.out.println(a/2);
			} catch (Exception e) {
				System.out.println("output is not executed");
				e.printStackTrace();
			}
			System.out.println(7/0);
		} catch (Exception e) {
			System.out.println("Output is executed");
			e.printStackTrace();
		}
		finally {
			System.out.println("Output is clear");

		}
	}

}

