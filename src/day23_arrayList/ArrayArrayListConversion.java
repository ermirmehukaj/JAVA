package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {


    public static void main(String[] args) {

        String [] arr = {"a","b","c","d"};
        String [] arr1 = {"a","b","c","d"};

        //ArrayList<String> list = new ArrayList<>(Arrays.asList(arr,arr1));

        //System.out.println(list);

        System.out.println("--------------------------------------------------------");




        ArrayList<String > list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

            String [] language = list2.toArray(new String[list2.size()]);

        System.out.println(Arrays.toString(language));

        System.out.println("----------------------------------------------------");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7));

        Integer [] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));





    }
}
