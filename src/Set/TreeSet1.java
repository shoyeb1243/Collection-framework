package Set;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
class  Employee{
	void m1() {
		SortedSet<Integer>set=new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(50);
		set.add(30);
		set.add(01);
		set.add(90);
		set.comparator();
		Iterator<Integer> sIterator=set.iterator();
		while (sIterator.hasNext()){
		System.out.println(sIterator.next());
	}
	}
}
public class TreeSet1 {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.m1();
	}
}
