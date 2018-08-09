/**
 * 
 */
package com.mohan.java;

/**
 * @author mchandra
 *
 */
public class InterfaceDemo implements onRegistration {

	static ConnectInterface connectInterface;

	public InterfaceDemo(ConnectInterface connectInterface2) {
		this.connectInterface = connectInterface2;
		connectInterface.OnConnect();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// connectInterface.OnConnect();

	}

	@Override
	public void onShowSuccess() {

	}

	@Override
	public void onShowError() {

	}

	@Override
	public void onShowErrorOnEmail() {

	}

	@Override
	public void onShowErrorOnUsername() {

	}

	@Override
	public void OnConnect() {
		System.out.println("OnConenct is Called");
	}

	@Override
	public void onDisconnect() {
		System.out.println("OnDisConenct is Called");

	}

}

interface onRegistration extends ConnectInterface {
	void onShowSuccess();

	void onShowError();

	void onShowErrorOnEmail();

	void onShowErrorOnUsername();

}

interface ConnectInterface {
	void OnConnect();

	void onDisconnect();
}
