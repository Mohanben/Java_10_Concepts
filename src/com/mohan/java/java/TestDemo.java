package com.mohan.java.java;

public class TestDemo {

	private String name;

	private int VIN;

	private String vehicleName;

	static {
		System.out.println("Static Constructor is called");
	}

	{
		System.err.println("Inline Constructor is Called");
	}

	public TestDemo() {
		name = "mohanben22@gmail.com";
		System.out.println("Constructoe is called");
	}

	public TestDemo(int VIN, String vechileName) {
		this.VIN = VIN;
		this.vehicleName = vechileName;
	}

	void getVehicleInfo() {
		System.out.println("Parameter constructor " +"\t"+ VIN + "\t" + vehicleName);
	}

	public static void main(String[] args) {
		TestDemo demo = new TestDemo();
		System.out.println(demo.name);
		TestDemo testDemo = new TestDemo(122, "Volvo Cars");
		testDemo.getVehicleInfo();
	}

}
