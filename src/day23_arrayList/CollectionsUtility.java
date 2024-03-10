package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2));


       int max =  Collections.max(list);
       int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);


        System.out.println("----------------------------------------------");
        
        
        ArrayList<String> names = new ArrayList<>();
        
        
        names.addAll(Arrays.asList("Alena","Muhtar","Ermir","Art","Ermir","Ermir","Muhtar"));
        
        
        Collections.sort(names);

        System.out.println("names = " + names);



        System.out.println("----------------------------------------------");


        Collections.reverse(names);
        System.out.println(names);


        System.out.println("----------------------------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir","Hasan","Abdullah"));

        System.out.println(students);

        Collections.swap(students, 0,1);

        System.out.println(students);









    }
}
