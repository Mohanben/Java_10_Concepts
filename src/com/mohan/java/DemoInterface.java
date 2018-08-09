/**
 * 
 */
package com.mohan.java;

import java.util.Scanner;

/**
 * @author mchandra
 *
 */
public class DemoInterface extends InterfaceDefinition {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value");
		int value = scanner.nextInt();
		OnInternetConnected demoInterface = new DemoInterface();
		switch (value) {
		case 0:
			demoInterface.onConnected();
			break;
		case 1:
			demoInterface.onDisConnectd();
			break;
		default:
			break;
		}
		scanner.close();
	}

}

class InterfaceDefinition implements OnInternetConnected {

	public InterfaceDefinition() {
		System.out.println("Contrucror is Calleed");
	}

	@Override
	public void onConnected() {
		System.err.println("Internet is Connected");

	}

	@Override
	public void onDisConnectd() {
		// TODO Auto-generated method stub
		System.err.println("Internet is DisConnected");
	}

}

interface OnInternetConnected {
	public void onConnected();

	public void onDisConnectd();

}
