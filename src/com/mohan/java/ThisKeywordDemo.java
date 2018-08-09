package com.mohan.java;

public class ThisKeywordDemo {

	public void display() {
		this.show();
		System.err.println("Dispay method is Called");
	}

	private void show() {
		System.out.println("Show method is Called ");
	}

	public static void main(String[] args) {
		new ThisKeywordDemo().display();
	}

}
