package com.mohan.java;

import java.util.ArrayList;

public class ArrayListDemoD {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Mohan");
		arrayList.add("Ben");
		arrayList.add("ChandraSekar");
		arrayList.forEach(name -> System.err.println(name));
		System.out.println(args.toString());
	}

}
