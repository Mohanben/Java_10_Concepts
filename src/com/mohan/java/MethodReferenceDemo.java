/**
 * 
 */
package com.mohan.java;

@FunctionalInterface
interface MyInterface {
	void display();
}

public class MethodReferenceDemo {
	public void myMethod() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		MethodReferenceDemo obj = new MethodReferenceDemo();
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;
		// Calling the method of functional interface
		ref.display();
		
		DemoInter demoInter = obj::myMethod;
		demoInter.onConnect();
	}
}

@FunctionalInterface
interface DemoInter {
	public void onConnect();
}