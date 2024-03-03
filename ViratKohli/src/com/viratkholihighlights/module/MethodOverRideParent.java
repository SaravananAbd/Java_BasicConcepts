package com.viratkholihighlights.module;

public class MethodOverRideParent {

	public void empDetails(String empDetails, int empId) {

		System.out.println("empDetails =" + empDetails + empId);

	}

	public void empDetails(String empDetails, int empId, String sd) {

		System.out.println("empDetails =" + empDetails + empId + "sd =" + sd);
		{
		}
	}

}
