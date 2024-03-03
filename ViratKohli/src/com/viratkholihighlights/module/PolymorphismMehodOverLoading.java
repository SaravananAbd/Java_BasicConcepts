package com.viratkholihighlights.module;

public class PolymorphismMehodOverLoading {

	public void stdDetails(String stdName) {

		System.out.println("stdName =" + stdName);

	}

	public void stdDetails(int tamilMarks, int englishMarks) {

		System.out.println("tamilMarks =" + tamilMarks + "," + " englishMarks =" + englishMarks);

	}

	public void stdDetails(int tamilMarks, int englishMarks, int mathsMarks) {

		System.out.println("tamilMarks =" + tamilMarks + "," + " englishMarks =" + englishMarks + "," + " mathsMarks "
				+ mathsMarks);

	}

	public void stdDetails(String stdName, char iniTial) {

		System.out.println("stdName =" + stdName + "." +  iniTial);

	}
	public static void main(String[] args) {
		
		PolymorphismMehodOverLoading mo = new PolymorphismMehodOverLoading();
		mo.stdDetails("Saravanan");
		mo.stdDetails(90, 80);
		mo.stdDetails(60, 50, 80);
		mo.stdDetails("Saravanan", 'R');
	}

}
