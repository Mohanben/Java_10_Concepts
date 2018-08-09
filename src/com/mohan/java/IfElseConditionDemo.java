package com.mohan.java;

import java.util.Scanner;

public class IfElseConditionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int validInt = scanner.nextInt();

		if (validInt < 100) {
			if (validInt % 2 == 0) {
				if (validInt > 2 && validInt < 5) {
					System.out.println("Not Weird");
				} else if (validInt > 6 && validInt < 20) {
					System.out.println("Weird");
				} else if (validInt < 20) {
					System.out.println("Not Weird");
				}
			} else {
				System.out.println("Weird");

			}

			scanner.close();
		}

	}

}