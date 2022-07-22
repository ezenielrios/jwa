package com.training.jwa.collectiondemos;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		Map data = new TreeMap();

		//data.add XXX error
		data.put("Daniel",89000);
		data.put("Alex",19000);
		data.put("Ahmed",69000);
		data.put("Neena",69000);
		data.put("Richard",69000);

		System.out.println(data);
	}

}
