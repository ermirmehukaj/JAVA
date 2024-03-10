package day41_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer>[] arrayOfLists = new List[3];

        arrayOfLists[0] = list;
        arrayOfLists[1] = list1;
        arrayOfLists[2] = list2;

        System.out.println(Arrays.toString(arrayOfLists));

        arrayOfLists[0].set(4,50);
        System.out.println(Arrays.toString(arrayOfLists));



    }
}
