package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Ermir");
        names.add("Fanol");
        names.add("Bardh");


        ArrayList<String> nonDup = new ArrayList<>();


        for (String each : names) {
            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }

       names = nonDup;
        System.out.println(names);


        System.out.println("-------------------------------------");



        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        System.out.println(list1.equals(list2));

        System.out.println("---------------------------------------------------");
        
        ArrayList<Integer> n1  = new ArrayList<>();
        
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2  = new ArrayList<>();

        n2.add(10);
        n2.add(20);
        n2.add(30);


        System.out.println("n2 = " + n2);
        System.out.println("n1 = " + n1);

        System.out.println(n1.equals(n2));


        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());




    }
}