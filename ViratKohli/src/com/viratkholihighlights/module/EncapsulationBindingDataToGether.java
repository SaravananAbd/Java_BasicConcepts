package com.viratkholihighlights.module;

public class EncapsulationBindingDataToGether {

	public void stdId(String stdId) {

		System.out.println("std id =" + stdId);

	}

	public void stdName(String stdName, int stdAge, char initial) {
		System.out.println("stdName =" + stdName + " stdAge = " + stdAge + " initial = " + initial);

	}

	public  void addressDetails(String addRess,int doorNo,boolean crt) {
		System.out.println("addressdetails ="+ addRess+" doorNo ="+ doorNo+" crt="+ crt);
		
	}
	
	public static void main(String[] args) {
		
		EncapsulationBindingDataToGether ec = new EncapsulationBindingDataToGether();
		
		ec.stdId(" batch 2");
		ec.stdName("saravanan", 17, 'R');
		ec.addressDetails("by pass road[east]", 127, true);
		
		
	}
}

