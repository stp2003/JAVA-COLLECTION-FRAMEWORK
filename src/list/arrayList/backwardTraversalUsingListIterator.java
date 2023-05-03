package list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class backwardTraversalUsingListIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        //** adding elements ->
        list.add(10);
        list.add(20);
        list.add(30);

        //?? backward printing ->
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
