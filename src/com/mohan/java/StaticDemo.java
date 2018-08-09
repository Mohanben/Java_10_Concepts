package com.mohan.java;

public class StaticDemo {
	private static int var ;
	
	static {
		var = 10;
	}

	public static void main(String[] args) {
		System.out.println(var);
	}

}
