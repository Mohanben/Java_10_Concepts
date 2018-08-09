package com.mohan.java;

public class LamDaExpressionDemo extends MySample implements MyFunctionalInterface {

	public static void main(String[] args) {
		LamDaExpressionDemo daExpressionDemo = new LamDaExpressionDemo();
		daExpressionDemo.onConnectd();

		MyFunctionalInterface functionalInterface = () -> {
			System.err.println("Connectd Internet");
		};

		functionalInterface.onConnectd();

		MutipleInterfaceArguments arguments = (x, y) -> {
			return x.concat(y);
		};
		
		System.err.println(arguments.getSpeed("Mohan", "asas"));

	}

	@Override
	public void onConnectd() {
		System.err.println("Conencted");

	}

}

class MySample {
	public MySample() {

	}

}

interface MyFunctionalInterface {
	public void onConnectd();
}

interface MutipleInterfaceArguments {
	public String getSpeed(String vehiceNumber, String Speed);
}