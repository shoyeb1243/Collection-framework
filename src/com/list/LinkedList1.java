package com.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List <String>list=new LinkedList<>();
		list.add("Silent");
		list.add("Tufail");
		list.add("Ayaz");
		list.add("Boy");
		System.out.println(list);
List<String>list1=new LinkedList<>(list);

list1.add("Abu");
list1.add("Munna");
list1.add(0, "SilentBoy");
list1.removeAll(list1);

System.out.println(list1.isEmpty());

	}

}
