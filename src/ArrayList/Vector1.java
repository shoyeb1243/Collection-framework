package ArrayList;
import java.util.Enumeration;
import java.util.Vector;
public class Vector1 {

	public static void main(String[] args) {
	 Vector v=new Vector();
	 v.add(10);
	 v.add(20);
	 v.add(30);
	Enumeration enu=v.elements();
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement());
	}
	}
}
