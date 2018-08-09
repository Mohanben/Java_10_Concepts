/**
 * 
 */
package com.mohan.java;

import com.hackerrank.java.SuperKeywordDemo.Student.Name;

/**
 * @author mchandra
 *
 */
public class SuperKeywordDemo extends Person {

	static class Student {
		class Name {
			public void getSpeed() {
				System.err.println("getSPeed methos is called");
			}
		}
	}

	public void show() {
		System.out.println("Show method is called");
	}

	public void display() {
		show();
		super.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SuperKeywordDemo().display();
	}

}

class Person {
	public void show() {
		System.err.println("Show method is Called");
	}
}