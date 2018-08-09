/**
 * 
 */
package com.mohan.java.java;

public class MethodReferenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodReferenceDemo demo = new MethodReferenceDemo();
		MethodReference methodReference = demo::getMilage;

		methodReference.getSpeed();
	}

	void print(String name) {

	}

	public void getMilage() {
		System.out.println("GetMilage method is Called");
	}
}

interface MethodReference {
	public void getSpeed();
}
