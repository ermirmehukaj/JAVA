package day41_maps;



import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
list.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list);
        lists.add(list1);

        System.out.println(lists);

        System.out.println(lists.get(1).get(3));

        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }


        System.out.println("------------------------------------------------------------------");

        List<Set<Integer>> listSets = new ArrayList<>();

        listSets.add(new LinkedHashSet<>());
        listSets.add(new LinkedHashSet<>());
        listSets.add(new LinkedHashSet<>());
        listSets.add(new LinkedHashSet<>());

        System.out.println(listSets);

        listSets.get(0).addAll(Arrays.asList(10,5,20));
        listSets.get(1).addAll(Arrays.asList(50,8,90));
        listSets.get(2).addAll(Arrays.asList(70,2,12));
        listSets.get(3).addAll(Arrays.asList(43,4,67));

        System.out.println(listSets);

        System.out.println("-----------------------------------------------------------");
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7,8,9};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        listOfArrays.get(0)[2] = 35;

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("----------------------------------------------------------");

        List<List<Employee>> teams = new ArrayList<>();





    }
}
