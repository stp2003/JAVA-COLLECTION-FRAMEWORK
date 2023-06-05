package collection_framework.generic;


import java.util.ArrayList;

class Student {
    void print() {
        System.out.println("Students");
    }
}

class EngineeringStudent extends Student {
    void print() {
        System.out.println("Engineering Students");
    }
}

class ManagementStudent extends Student {
    void print() {
        System.out.println("Management Students");
    }
}

public class Wildcards_in_generics {

    //?? using wildcards in generics ->
    static void printStudents(ArrayList<? extends Student> arrayList) {
        for (Student student : arrayList)
            student.print();
    }

    public static void main(String[] args) {

        ArrayList<EngineeringStudent> arrayList1 = new ArrayList<>();
        arrayList1.add(new EngineeringStudent());

        ArrayList<ManagementStudent> arrayList2 = new ArrayList<>();
        arrayList2.add(new ManagementStudent());

        printStudents(arrayList1);
        printStudents(arrayList2);

    }
}
