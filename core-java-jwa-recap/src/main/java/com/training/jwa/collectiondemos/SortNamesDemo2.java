package com.training.jwa.collectiondemos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortNamesDemo2 {
	
	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		
		names.add("Ingraham");
		names.add("Alex");
		names.add("Izzi");
		names.add("Grace");
		names.add("Edwards");
		names.add("Mullins");
		names.add("Ahmed");
		names.add("Naomi");
		names.add("Keith");
		names.add("Alex");
	//	names.add(12);
	//	names.add(false);
		
		
		System.out.println("Before sorting");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println("After sorting");
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println("After reverse");
		System.out.println(names);
		
		names.remove("Izzi");
		names.remove("Ahmed");
		System.out.println("After removing izzi");
		System.out.println(names);
	}

}
