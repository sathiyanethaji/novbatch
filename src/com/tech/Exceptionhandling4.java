package com.tech;

import java.util.Scanner;

public class Exceptionhandling4 {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the age of person");
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		
		if (age==18) {
			System.out.println("eligible for voting");
			
		}
		else {
			System.out.println("not eligible");
		    throw new Exception();
		
		}
		
	}
}
