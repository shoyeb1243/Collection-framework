package Set;
import java.util.HashSet;
import java.util.Iterator;
class Emp{
	void main() {
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(58);
		hashSet.add(101);
		hashSet.add(01);
		hashSet.add(102);
		Iterator iterator=hashSet.iterator();
		while (iterator.hasNext()) {
	    System.out.println("Value : "+iterator.next());
}
}
}
public class HassSetEx {
	public static void main(String[] args) {
	 Emp emp=new Emp();
	 emp.main(); 
	}

}
