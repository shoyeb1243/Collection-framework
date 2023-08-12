package ArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListConcurrentModification {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> numbers
	    = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});

	  Iterator<Integer> iterator = numbers.iterator();
	  while (iterator.hasNext()) {
	      iterator.remove();    //asadullqah bhai sey poochhenge remove mat karna samjhna h isko
	      System.out.println(iterator.next());
	  }
	}
}
