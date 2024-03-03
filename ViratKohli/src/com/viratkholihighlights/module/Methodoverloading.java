package com.viratkholihighlights.module;

public class Methodoverloading {

	public void sub() {

		System.out.println("This is method 1");

	}

	public void sub(int a, int b) {
		System.out.println("a= " + a);
		System.out.println("This is Method 2");

	}

	public void sub(int a) {

		System.out.println("a=" + a);
		System.out.println("This is Method 3");

	}

	public void sub(int a, int b, int c) {

		System.out.println("a=" + a);
		System.out.println("This is Method 4");

	}

	public void sub(String a, int b) {

		System.out.println("b=" + b);
		System.out.println("This is Method 5");

	}

	public void sub(int b, String a) {
		
		System.out.println("a="+a);
		System.out.println("This is Method 6");
		

	}

	public static void main(String[] args) {
		
		Methodoverloading m = new Methodoverloading();
		m.sub();
		m.sub(10, 20);
		m.sub(17);
		m.sub(10, 20, 30);
		m.sub("saravanan", 17);
		m.sub(17, "saravanan");
		

	}

}
