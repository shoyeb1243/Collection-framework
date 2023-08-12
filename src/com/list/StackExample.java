package com.list;
import java.util.Enumeration;
import java.util.Stack;
public class StackExample {
	public static void main(String[] args) {
	Customer customer=new Customer("Ansarul", "Semariyawan");
	Customer customer2=new Customer("Abuzar", "Baghnagar");
	Customer customer3=new Customer("AbuSfiyan", "Baghnagar");
	Customer customer4=new Customer("Ayaz", "Baghnagar");
	Customer customer5=new Customer("Tufail", "Baghnagar");
	Stack<Customer> stack=new Stack<>();
	stack.push(customer);
	stack.push(customer2);
	stack.push(customer3);
	stack.push(customer4);
	stack.push(customer5);
	System.out.println(stack);
	System.out.println("................................................");
	Enumeration<Customer> enumeration=stack.elements();
	while (enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
		}
	}
}
