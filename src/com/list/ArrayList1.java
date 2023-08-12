package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1
{
	public static void main(String[] args) {
Student student=new Student(101, "SilentBoy", "Baghnagar");
Student student1=new Student(102, "AbuZar", "Baghnagar");
Student student2=new Student(103, "AbuSufiyan", "Baghnagar");
Student student3=new Student(104, "Ansarul", "Semariyawa");
Student student4=new Student(104, "Ansarul", "Semariyawa");
List<Student> list=new ArrayList<>();
list.add(student);
list.add(student1);
list.add(student2);
list.add(student3);
list.add(student4);
System.out.println(list);
System.out.println("...............................................");
for(Student iter : list) {
System.out.println(iter);	
}
	}

}
