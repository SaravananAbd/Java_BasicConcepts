package com.viratkholihighlights;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Topic {
	
	public static void main(String[] args) {
		
		

		List<Object> listmethods = new  LinkedList<Object>();
		
		listmethods.add("abdevilliers");
		listmethods.add(17);
		listmethods.add("odi");
		listmethods.add("twentytwenty");
		listmethods.add("ipl");
		
		System.out.println(listmethods);
		
		int size1 = listmethods.size();
		System.out.println(size1);
		
		
		listmethods.add(3,"Test");
		System.out.println(listmethods);
		
		boolean contains = listmethods.contains(17);
		System.out.println(contains);
		System.out.println(listmethods.contains(18));
		
		boolean equals = listmethods.equals(listmethods);
		System.out.println(equals);
		
		Object object = listmethods.get(3);// will pass the index get the object
		System.out.println(object);
		
		Object remove = listmethods.remove(2);
		System.out.println(remove);
		
		System.out.println(listmethods);
		
		int size = listmethods.size();
		System.out.println(size);
		
		listmethods.set(2, "highest");
		System.out.println(listmethods);
		
		Object set = listmethods.set(3, "sara");
		System.out.println(listmethods);
		
		listmethods.clear();
		System.out.println(listmethods);
		
		
	}

}
