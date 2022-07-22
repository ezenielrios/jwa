package com.training.jwa.collectiondemos;

import java.util.LinkedHashSet;
import java.util.Set;

public class SortNamesDemo {
	
	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		
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
		
		System.out.println(names);
		
		names.remove("Izzi");
		System.out.println("After removing izzi");
		System.out.println(names);
	}

}
