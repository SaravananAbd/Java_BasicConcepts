package com.viratkholihighlights.module;

public class Sample_Constructor {

	public Sample_Constructor() {

		this(17);
		System.out.println("default constructor");
	}

	public Sample_Constructor(int age) {
		this("saravanan");
        System.out.println("Age ="+age);
	}

	public Sample_Constructor(String name) {
		
		System.out.println();
		System.out.println("Name ="+name);

	}

	public static void main(String[] args) {
		
		Sample_Constructor sc = new Sample_Constructor();
		

	}

}
