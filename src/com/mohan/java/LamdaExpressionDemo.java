/**
 * 
 */
package com.mohan.java;

public class LamdaExpressionDemo {

	public static final int A = 10;

	public static final int B = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Drawable value = () -> {
			return A + B;

		};
		value.draw();

		display(value);
	}

	private static void display(Drawable drawable) {
		System.err.println(drawable.draw());
	}

	Drawable string = () -> A;

}

interface Drawable {
	public int draw();
}
