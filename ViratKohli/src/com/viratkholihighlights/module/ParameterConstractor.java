package com.viratkholihighlights.module;

public class ParameterConstractor {

	public ParameterConstractor() {
		this(25);
		System.out.println("no con");

	}

	public ParameterConstractor(String id) {
		System.out.println("std id =" + id);
	}

	public ParameterConstractor(int stdid) {
		this("sara");
		System.out.println("Std id =" + stdid);

	}

	public static void main(String[] args) {

		ParameterConstractor pc = new ParameterConstractor();
	}
}
