package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIstMethods {
    public static void main(String[] args) {


int [] array = {1,2,3,4,5};

array[0] = 100;

        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        groceriesList.set(2,"Orange");
        System.out.println(groceriesList);


        groceriesList.remove(0);
        System.out.println(groceriesList);

        groceriesList.remove("paper Towels");
        System.out.println(groceriesList);


        System.out.println("----------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 =numbers.remove(Integer.valueOf(20));



        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();
        System.out.println(numbers);

        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Ermir");

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Sumeye"));


    }
}
