package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
public class ListIterator1 {
	public static void main(String[] args) {
	List a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
           ListIterator listIterator=a.listIterator(a.size());
           while(listIterator.hasPrevious()){
        	System.out.println(listIterator.previous()); 
           
        	   
           }
	}

}
