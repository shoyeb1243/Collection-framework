package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("SilentBoy");
		vector.add("Shoyeb");
		vector.add("9919940371");
		vector.add("786471382718");
		vector.add(null);
		vector.add(null);
		vector.add("OJSPS5627G");
		System.out.println(vector);
		System.out.println(".....................................................................");
		Enumeration<String> enumeration=vector.elements();
		while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	}
}
}