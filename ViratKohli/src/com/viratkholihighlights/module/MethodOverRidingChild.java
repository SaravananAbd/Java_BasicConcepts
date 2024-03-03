package com.viratkholihighlights.module;

public class MethodOverRidingChild extends MethodOverRideParent {
	
	public void empDetails(String empDetails,int empId) {
		
		System.out.println("empDetails ="+ empDetails + empId);
		super.empDetails(empDetails, 11);
		super.empDetails("sar", 10, "sara");
		

	}
	

	public static void main(String[] args) {
		
		MethodOverRidingChild mc = new MethodOverRidingChild();
		mc.empDetails("saravanan", 10);
	}

}
