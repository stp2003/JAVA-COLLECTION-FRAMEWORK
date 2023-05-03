package list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class doubleEveryElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        //** adding elements ->
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            int x = (Integer) iterator.previous();
            //** doubling every value ->
            iterator.set(x * 2);
        }
        System.out.println(list);
    }
}
