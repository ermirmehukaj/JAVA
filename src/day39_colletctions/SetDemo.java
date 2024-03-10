package day39_colletctions;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(20,34,45,56,65,24));

        System.out.println(set1);
        System.out.println("---------------------------------------------");



        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(20,34,45,56,65,24));
        set2.addAll(Arrays.asList(13,79,90,31,48,91));

        System.out.println(set2);


        System.out.println("---------------------------------------------");


        Set<Integer> set3 = new TreeSet<>();


        set3.addAll(Arrays.asList(20,34,45,56,65,24));
        set3.addAll(Arrays.asList(13,79,90,31,48,91));


        System.out.println(set3);

        System.out.println("---------------------------------------------");


String [] words = {"Java","Java","Java", "Python","Python","C#","Ruby","Javascript","C#"};

Set<String> result = new LinkedHashSet<>();

result.addAll(Arrays.asList(words));

        System.out.println(result);
/*
        for (String each : result) {
            System.out.println(each);
        }*/

        System.out.println(new ArrayList<>(result).get(1));

        words = result.toArray(new String[0]);

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------------------");


        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10,101,10,10,20,20,0,30,40,11,11,1,1,1,1));


        Set<Integer> n = new TreeSet<>(numbers);

        System.out.println(n);



    }





}
