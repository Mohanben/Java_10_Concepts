package com.mohan.java.java;

public class ConstrctorOverloadingDemo {

	private String studName;

	private String studAddress;

	private String studPhoneNumber;

	/**
	 * @return the studName
	 */
	public String getStudName() {
		return studName;
	}

	/**
	 * @return the studAddress
	 */
	public String getStudAddress() {
		return studAddress;
	}

	/**
	 * @return the studPhoneNumber
	 */
	public String getStudPhoneNumber() {
		return studPhoneNumber;
	}

	public ConstrctorOverloadingDemo() {
		this.studName = "Mohan Chandrasekar";
		this.studAddress = "Vasagatan 8B , Gothernburg";
		this.studPhoneNumber = "+4566434535";
	}

	public ConstrctorOverloadingDemo(String studentName, String studentAddress, String studentPhoneNumber) {
		this.studName = studentName;
		this.studAddress = studentAddress;
		this.studPhoneNumber = studentPhoneNumber;
	}

	public static void main(String[] args) {
		ConstrctorOverloadingDemo constrctorOverloadingDemo = new ConstrctorOverloadingDemo();
		System.err.println(constrctorOverloadingDemo.getStudName());
		System.err.println(constrctorOverloadingDemo.getStudAddress());
		System.err.println(constrctorOverloadingDemo.getStudPhoneNumber());

		ConstrctorOverloadingDemo demo = new ConstrctorOverloadingDemo("SakthiVel", "C:N:Palayam", "23434343");
		System.out.println(demo.getStudName());
		System.out.println(demo.getStudAddress());
		System.out.println(demo.getStudPhoneNumber());

	}

}
