package com.mohan.java;

import java.util.ArrayList;

public class LocalVaribaleInterface {

	public static void main(String[] args) {

		var name = new ArrayList<String>();
		name.add("Mohan");

		for (int i = 0; i < name.size(); i++) {
			System.err.println(name.get(i));
		}

		MyMethod method = () -> {
			return "Hello";
		};
		method.get();
		display(method);

		ArgumentFUcntionInterface fUcntionInterface = (mmmm) -> {
			return mmmm + "\tMOhan";
		};

		System.out.println(fUcntionInterface.getargument("Welcome"));

		MutipleArguments arguments = (namee, address, number) -> {
			return name + address + number;
		};

		arguments.getDisplay("Mohan", "No 20 Nanban Nagar", 98689);
		System.err.println(arguments.getDisplay("Mohan", "No 20 Nanban Nagar", 98689));
	}

	private static void display(Object object) {
		System.out.println(object.toString());
	}

}

interface MyMethod {
	String get();
}

interface ArgumentFUcntionInterface {
	public String getargument(String result);
}

interface MutipleArguments {
	public String getDisplay(String name, String address, int number);
}