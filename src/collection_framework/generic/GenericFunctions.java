package collection_framework.generic;

public class GenericFunctions {
    public static <T> int count(T[] arr, T x) {
        int res = 0;
        for (T e : arr) {
            if (e.equals(x))
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        System.out.println(count(arr, 30));

        String [] str = {"a", "b", "c", "d"};
        System.out.println(count(str, "c"));

    }

}
