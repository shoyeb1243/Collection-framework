package com.list;

import java.util.Enumeration;
import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
	stack.push("SilentBoy");
	stack.push("9919940371");
	stack.push("786471382718");
	stack.push(null); 
	stack.push(null);
	stack.push("AbuZar");
	stack.push("AbuSufiyan");
	stack.pop();
	stack.push("Ansarul");
	System.out.println(stack);
	System.out.println(stack.size());
	Enumeration<String> enumeration=stack.elements();
	while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	}
	}
}
