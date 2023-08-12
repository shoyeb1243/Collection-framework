import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("AbuZar");
		list.add("AbuSfiyan");
		list.add("Ansarul");
		list.add("SilentBoy");
		list.add("Tufail");
		System.out.println(list);
		for (String s : list) {
			if(s.length()>6) {	
			List<String> arrayList = new ArrayList<>();
			arrayList.add(s);
			System.out.println(arrayList);
			}
		}
	}
}
