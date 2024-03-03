package com.methods.module;

public class Loop_Statement {

	public static void main(String[] args) {
		for (int i = 3; i<=1; i--) {  // row
			
			for (int j =3; j<=i; j++) {  // coloum
				
				System.out.print(j + " ");
				
			}
			System.out.println();

		}

	}
}
