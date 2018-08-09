package com.mohan.java;

public class LamdaExpressionTest {

	public static void main(String[] args) {

		MyLamda lamda = () -> {
			System.out.println("Mohan Chandrasekar");
		};

		lamda.display();

		MyAddLamda addLamda = (int a, int b) -> {
			if (b == 0) {
				return a - b;
			} else {
				return a + b;
			}
		};
		display(addLamda.add(10, 0));
	}

	private static void display(int add) {
		System.err.println("lamda output is " + "\t" + add);
	}
}

interface MyLamda {
	public void display();
}

interface MyAddLamda {
	public int add(int a, int b);
}

interface LocationManager {
	public void onChanged();
}
