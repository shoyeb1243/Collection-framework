package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListSet_Program {

	public static void main(String[] args) {
	List s=new ArrayList<>();
	s.add(10);
	s.add(20);
	s.add(10);
	s.add(null);
	s.add(null);
	Iterator itr=s.iterator();
	while (itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	}

}
