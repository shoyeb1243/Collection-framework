package com.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1
{
	public static void main(String[] args)
	{
	Hashtable<Integer,String> hashtable=new Hashtable<>();
	hashtable.put(101, "-> Mohammad Shoyeb :");
	hashtable.put(103, "-> Abu Zar :");
	hashtable.put(105 , "-> Sufiyan :");
	hashtable.put(104, "-> Silent Boy :");
	hashtable.put(106, "-> Abu Bakar :");
	  for(Object map :hashtable.keySet()) {
	  System.out.println( map + " " + hashtable.get(map)); 
	  }
//	  Set map=hashtable.entrySet(); Iterator itrIterator=map.iterator();
//	  while(itrIterator.hasNext()) { System.out.println(itrIterator.next()); }
//	 
	}
}
