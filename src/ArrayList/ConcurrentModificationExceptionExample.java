package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionExample {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("a")) {
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }
}