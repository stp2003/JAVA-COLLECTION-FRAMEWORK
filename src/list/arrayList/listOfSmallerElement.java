package list.arrayList;

import java.util.ArrayList;
import java.util.List;

//?? list Of Smaller Element than given key
public class listOfSmallerElement {

    //?? smaller element ->
    static List<Integer> getSmaller(int[] arr, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k)
                list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 40, 80, 30, 20, 15};

        List<Integer> list = getSmaller(arr, 30);
        for (Integer x : list)
            System.out.println(x);
    }
}
