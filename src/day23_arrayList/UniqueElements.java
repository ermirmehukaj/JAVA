package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
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

        for (String each : names) {

            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);

            }

        }

boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");
        System.out.println(hasMuhtar);
        System.out.println(hasAli);



    }
}