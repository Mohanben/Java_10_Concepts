package com.mohan.java;

import java.util.Scanner;

public class StringFormatDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String string = scanner.next();
			int num = scanner.nextInt();
			if (string.length() <= 10 && num <= 999) {
				System.out.printf("%-14s %03d %n", string, num);
			}
		}
		System.out.println("================================");
		scanner.close();
	}

}
