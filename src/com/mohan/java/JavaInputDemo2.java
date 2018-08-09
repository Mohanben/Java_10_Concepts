package com.mohan.java;

import java.util.Scanner;

public class JavaInputDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double d = scanner.nextDouble();
		String string = scanner.nextLine();
		string += scanner.nextLine();

		System.out.println("String: " + string);
		System.out.println("Double: " + d);
		System.out.println("Int: " + a);
		scanner.close();
	}

}
