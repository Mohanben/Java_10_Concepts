package com.mohan.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	private static ArrayList<ArrayList<Integer>> numberList = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			arrayList.add(scanner.nextInt());
		}
		numberList.add(arrayList);
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			try {
				System.out.println(numberList.get(x - 1).get(y) - 1);
			} catch (Exception e) {
				System.err.println("Error");
			}
		}
		scanner.close();
	}

}
