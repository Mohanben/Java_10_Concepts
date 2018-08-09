package com.mohan.java;

public class InheritanceDemo extends InheritanceBaseClass {

	public InheritanceDemo() {
		System.out.println("InheritanceDemo constrctor is Called");
	}

	public static void main(String[] args) {
		InheritanceDemo demo = new InheritanceDemo();
	//	InheritanceBaseClass baseClass = new InheritanceDemo();
		System.out.println(demo.name);
		System.out.println(demo.phoneNumber);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public int getPhoneNumber() {
		// TODO Auto-generated method stub
		return super.getPhoneNumber();
	}

}

class InheritanceBaseClass {
	public int phoneNumber;

	public String name;

	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public InheritanceBaseClass() {
		System.err.println("InheritanceBaseClass construtor is Called");
	}
}
