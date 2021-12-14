package com.tech;

public class MyException extends Exception {

	public MyException() {
		
		System.out.println("Age is not eligible for voting");
	}
    
	public  MyException(String st) {
	System.out.println(st);


}
}