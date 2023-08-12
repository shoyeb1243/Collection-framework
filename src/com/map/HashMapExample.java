package com.map;

import java.util.*;

public class HashMapExample {
public static void main(String[] args) {
	Map<Integer , String> p =new HashMap<>();
	
	p.put(101, "sahil");
	p.put(102, "Jamal");
	p.put(103, "Ahmad");
	p.put(102, "Mohd");
	
	for(int i : p.keySet()) {
		System.out.println("Key : " + i + " Value : " + p.get(i));
	}
}
}
