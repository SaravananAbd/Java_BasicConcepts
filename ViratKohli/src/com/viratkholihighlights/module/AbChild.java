package com.viratkholihighlights.module;

public class AbChild extends AbtractClass {

	@Override
	public void sbi() {
		System.out.println("bank name = sbi");
		
	}
	
	

	@Override
	public void hdfc() {
		System.out.println("hdfc");
		
	}
	public static void main(String[] args) {
		
		AbChild ab = new AbChild();
		ab.sbi();
		ab.hdfc();
		
		
		
	}

	
}
