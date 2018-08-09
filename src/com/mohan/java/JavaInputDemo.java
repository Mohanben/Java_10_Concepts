package com.mohan.java;

public class JavaInputDemo {

	public static void main(String[] args) {
		ConnectInterface connectInterface = new ConnectInterface() {
			
			@Override
			public void onDisconnect() {
				System.err.println("onConnect is Called");	
				
			}
			
			@Override
			public void OnConnect() {
				System.err.println("onDisconnect is Called");
				
			}
		};
//		Scanner scanner = new Scanner(System.in);
//		String myString = scanner.next();
//		int myInt = scanner.nextInt();
//		scanner.close();
//
//		System.out.println("myString is: " + myString);
//		System.out.println("myInt is: " + myInt);
		new InterfaceDemo(connectInterface);
	}

}
