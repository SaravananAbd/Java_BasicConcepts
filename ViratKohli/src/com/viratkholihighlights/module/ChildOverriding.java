package com.viratkholihighlights.module;

public class ChildOverriding extends Methodoverriding {

	public void workerName(String Wokername) {
		System.out.println("worker name ="+ Wokername);
		super.workername("hari");

	}

	public static void main(String[] args) {

		ChildOverriding cc = new ChildOverriding();
		cc.workerName("saravanan");
		
		
		
		
	}

}
