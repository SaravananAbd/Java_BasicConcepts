package com.viratkholihighlights.module;

public class Cons {
	
	
	public  Cons() {
		System.out.println("is default constructor");

	}

	public Cons (String name,int num) {
		
		System.out.println("Name =" + name + ","+ "Number =" + num);
		
	}
	 public Cons(String std) {
		 System.out.println("Student id ="+ std);
		 
	 }
	
	public static void main(String[] args) {
		
		Cons c = new Cons();
		Cons c1 = new Cons("saravanan",10);
		Cons c2 = new Cons("10101010");
	}
}
