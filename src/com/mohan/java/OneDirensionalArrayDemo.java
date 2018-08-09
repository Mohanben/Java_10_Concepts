package com.mohan.java;

import java.util.Scanner;

public class OneDirensionalArrayDemo {

	private static int[] a;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Array");
		int n = scanner.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		scanner.close();
	}

}
