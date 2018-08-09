package com.mohan.java;

public class ConstructiorDemo {

	private String name;

	private int age;
	private String bread;

	public ConstructiorDemo(String name, String bread, int age) {
		this.name = name;
		this.bread = bread;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}

	@Override
	public String toString() {
		return ("My Name is " + this.getName() + " bread and age is: " + this.getBread() + " " + this.getAge());
	}

	public static void main(String[] args) {
		ConstructiorDemo constructiorDemo = new ConstructiorDemo("Bella", "Labour", 12);
		System.out.println(constructiorDemo.toString());
	}

}
