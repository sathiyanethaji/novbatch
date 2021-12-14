package com.tech;

import java.util.Scanner;

public class Exceptionhandling5 {
	public static void main(String[] args) throws MyException {
		System.out.println("Enter the age of the person");
		
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		
		if (age==18) {
			System.out.println("eligible for voting");
			
		}
		else {
			//System.out.println("not eligible");
		    throw new MyException("Age is not eligible for voting");
		
	}
		System.out.println("................Processing...........");
	}
}
