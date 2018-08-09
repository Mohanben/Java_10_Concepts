package com.mohan.java;

public class StaticMethodDemo {

	private static String name = "Mohan";

	static void display() {
		System.err.println("Static method is Called" + "\t" + name);
	}

	void getFuction() {
		display();
		// System.out.println("Non static method is Called");
	}

	public static void main(String[] args) {
		// System.out.println(name);
		display();
		StaticMethodDemo demo = new StaticMethodDemo();
		demo.getFuction();
		staticClass class1 = new staticClass();
		class1.display();
		class1.getMainMethod();
	}

	static class staticClass {
		void display() {
			System.out.println(name);
		}

		void getMainMethod() {
			System.err.println("getMainMethod is Called");
		}
	}
}
