package com.viratkholihighlights.module;

public class Constructor {
	
	public Constructor() {
		
		System.out.println("This is defalut constructor");  // default constructor
	}
	
	public Constructor(int age, String name) {                                        // parameterized constructor
		
		System.out.println("age ="+age);
		System.out.println("Name ="+name);
		
		
	}
	
	public Constructor(String name, int age) {
		
		System.out.println("Name="+name+"Age ="+age);
	}
	
	public static void main(String[]args) {
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(17,"Saravanan");
		Constructor c2 = new Constructor("Saravanan",17);
	}

}
