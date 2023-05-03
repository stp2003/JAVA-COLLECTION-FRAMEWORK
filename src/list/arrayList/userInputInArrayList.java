package list.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class userInputInArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the arrayList -> ");
        int size = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);

    }
}
