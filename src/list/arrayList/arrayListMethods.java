package list.arrayList;

import java.util.ArrayList;

public class arrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        //?? add method ->
        //** add(object) ->
        arrayList.add("Shashwat");
        arrayList.add("Shandilya");
        arrayList.add("21BCE11173");
        System.out.println("add(object) -> " + arrayList);
        System.out.println();

        //** add(index, object) ->
        arrayList.add(1, "BCE");
        System.out.println("add(index, object) -> " + arrayList);
        System.out.println();


        //?? contains(object) ->
        System.out.println("contains(object) -> " + arrayList.contains("BCE"));
        System.out.println();


        //?? remove methods ->
        //** remove(index) ->
        arrayList.remove(1);
        System.out.println("remove(index) -> " + arrayList);
        System.out.println();

        //** remove(object) ->
        arrayList.remove("21BCE11173");
        System.out.println("remove(object) -> " + arrayList);
        System.out.println();


        //?? get(index) ->
        System.out.println("get(index) -> " + arrayList.get(1));
        System.out.println();


        //?? set(index, object) ->
        arrayList.set(1, "Tiwari");
        System.out.println("set(index, object) -> " + arrayList.get(1));
        System.out.println();


        //?? indexOf(object) ->
        System.out.println("indexOf(object) -> " + arrayList.indexOf("Shashwat"));
        System.out.println();


        //?? lastIndexOf(object) ->
        System.out.println("lastIndexOf(object) -> " + arrayList.lastIndexOf("Shashwat"));
        System.out.println();


        //?? isEmpty() ->
        System.out.println("isEmpty() -> " + arrayList.isEmpty());
        System.out.println();


        //?? clear() ->
        arrayList.clear();
        System.out.println("isClear() -> " + arrayList.isEmpty());
        System.out.println();

    }

}
