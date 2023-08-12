package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAdd {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes" })
		List<Integer> list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list);
	
	@SuppressWarnings("rawtypes")
	List list1=new ArrayList();
	list1.add("aaa");
	list1.add("bbb");
	list1.add("cccc");
	System.out.println(list1);
	list1.addAll(list);
	System.out.println(list1);
}
}