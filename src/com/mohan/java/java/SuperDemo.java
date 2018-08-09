package com.mohan.java.java;

public class SuperDemo {

	public SuperDemo() {
		System.out.println("Parent Class of Cosntructor is Called");
	}

	public static void main(String[] args) {
		SuperDemo demo = new ChildDemo();
	}
}

class ChildDemo extends SuperDemo {
	public ChildDemo() {
		System.err.println("ChildClass Of Constructor is called");
	}
}
