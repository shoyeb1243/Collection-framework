package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
	Employee employee=new Employee(10, "Shoyeb", "Buniyaad", "Baghnagar");
	Employee employee2=new Employee(11, "AbuZar", "Buniyaad", "Baghnagar");
	Employee employee3=new Employee(12, "AbuSufiyan", "Buniyaad", "Baghnagar");
	Employee employee4=new Employee(13, "AbuBakar", "Buniyaad", "Baghnagar");
	
	Vector<Employee> employees=new Vector<>();
	employees.add(employee);
	employees.add(employee2);
	employees.add(employee3);
	employees.add(employee4);
	System.out.println(employees);
	System.out.println("..................................................................................");
	Enumeration<Employee> enumeration=employees.elements();
	while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	}
	}

}
