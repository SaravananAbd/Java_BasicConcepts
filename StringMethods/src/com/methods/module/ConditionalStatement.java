package com.methods.module;

public class ConditionalStatement {

	public static void main(String[] args) {
        //VARIABLE NAME CAR 
		String car = "bmw";// VALUE NAME BMW
		switch (car) {

		case "audi":
			System.out.println("Honda -condition satified");

			break;

		case "bmw":
			System.out.println("bmw - condition satified");

			break;
		
		case "benz":
			System.out.println("benz - condition satified");
			
			break;
		
		default:
			System.out.println("invaild condition");
			break;
		}

	}

}
