package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListTraversal {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("GFG ");
        arrayList.add("IDE ");
        arrayList.add("Courses ");

        //?? get() ->
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();


        //?? for each loop ->
        for (String s : arrayList) {
            System.out.print(s);
        }
        System.out.println();


        //?? using iterator() ->
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();

        //** benefits of using iterator() ->
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);
        arrayList1.add(30);

        Iterator<Integer> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()) {
            int x = (Integer) iterator1.next();
            if (x < 10)
                iterator1.remove();
            else
                System.out.println(x);
        }
        System.out.println();


        //?? for each method ->
        arrayList1.forEach(x -> System.out.println(x));
    }
}
