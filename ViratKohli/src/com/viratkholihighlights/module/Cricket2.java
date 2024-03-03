package com.viratkholihighlights.module;

public class Cricket2 implements Cricket{

	
	public void kohli() {
		
		System.out.println("Name Is Virat");
		
		}

	public void abd() {
		System.out.println("Name is Benjamin");
		
		}

	public void dhoni() {
		System.out.println("Name is Mahi");
		
		
	}
	public static void main(String [] args) {
		
		Cricket2 cc = new Cricket2();
		
		cc.kohli();
		cc.abd();
		cc.dhoni();
	}

}
