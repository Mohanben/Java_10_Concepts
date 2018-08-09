/**
 * 
 */
package com.mohan.java;

/**
 * @author mchandra
 *
 */
public class MethodReference {

	/**
	 * @param args
	 */
	private int speed = 0;

	public MethodReference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		MethodReference methodReference = new MethodReference();
		IConnect connect = methodReference::getSpeed;
		connect.onConnect();

		IConnect connect2 = MethodReference::getConnectionStatus;
		connect2.onConnect();

		// IConnect connect3 = methodReference::new;
		// connect3.onConnect();

	}

	public static int getConnectionStatus() {
		System.err.println("Callled");
		return 1;
	}

	public int getSpeed() {
		System.out.println("GetSPeed is Called");
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

@FunctionalInterface
interface IConnect {
	public void onConnect();
}
