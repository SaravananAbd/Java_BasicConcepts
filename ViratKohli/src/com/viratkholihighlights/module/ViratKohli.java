package com.viratkholihighlights.module;

public class ViratKohli {
	public void stdNAme(String stdName) {
		System.out.println("Std name =" + stdName);

	}

	public void stdAge(int stdage) {
		System.out.println("std  age =" + stdage);

	}

	public void stdOdi() {
		System.out.println("183");
	}

	public void stdTest(int testMark, int odiMark) {
		System.out.println("test mark =" + testMark + " :"+ " "+ "odi mark =" + odiMark);

	}

	public void stdT20() {
		System.out.println("130");

	}

	public static void main(String[] args) {
		ViratKohli vk = new ViratKohli();
		vk.stdNAme("virat kohli");
		vk.stdAge(26);
		vk.stdOdi();
		vk.stdTest(25,34);
		vk.stdT20();
	}
}
