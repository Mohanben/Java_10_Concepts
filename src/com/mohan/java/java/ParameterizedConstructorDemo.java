package com.mohan.java.java;

public class ParameterizedConstructorDemo {

	private int var;

	public ParameterizedConstructorDemo() {
		this.var = 10;
	}

	public ParameterizedConstructorDemo(int VIN, String name) {
		this.var = VIN;
	}

	public int getValue() {
		return var;
	}

	public static void main(String[] args) {
		ParameterizedConstructorDemo constructorDemo = new ParameterizedConstructorDemo();
		System.err.println(constructorDemo.getValue());
//		ParameterizedConstructorDemo demo = new ParameterizedConstructorDemo(120, "Mohan");
//		System.out.println(demo.getValue());
	}

}
