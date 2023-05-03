package list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class addInEveryElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        //** adding elements ->
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
           iterator.add(5);
           iterator.next();
        }
        System.out.println(list);
    }
}
