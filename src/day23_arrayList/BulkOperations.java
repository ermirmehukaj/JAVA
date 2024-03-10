package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {



        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);




        list1.addAll(1,numbers);


        System.out.println(list1);

        System.out.println("-----------------------------------------");


        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(76,74,75,78,87));

        System.out.println(scores);
        System.out.println("-----------------------------------------");


        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir","Hasan","Muhtar","Abdullah"));


        System.out.println(students);

        students.addAll(2, Arrays.asList("Ermir","Fanol","Granit"));

        System.out.println(students);
students.set(2,"MUhtar");
        System.out.println(students);

        System.out.println("--------------------------------");


        Integer[] nums = {1,2,3,4,5,6,7};

        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(nums));
       // li.addAll(Arrays.asList(nums));


        System.out.println(li);



        System.out.println("----------------------------------------");

      ArrayList<String> employeesList = new ArrayList<>();
      
      employeesList.addAll(Arrays.asList("Alena","Muhtar","Ermir","Art"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        boolean hasAll = employeesList.containsAll(Arrays.asList("Alena","Ermir","Muhtar"));


        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAll = " + hasAll);

        System.out.println("---------------------------------------------");
        
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80));
        
        list.removeAll(Arrays.asList(10,20,80));

        System.out.println("list = " + list);
        System.out.println((list.get(2)));

        System.out.println("-------------------------------------------------");


ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Ermir","Art","Ermir","Ermir","Muhtar"));
        System.out.println(developers);
        developers.retainAll(Arrays.asList("Art","Alena"));
        System.out.println("developers = " + developers);

        System.out.println("-------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(Arrays.asList("Eggs","Potato", "Milk","Rice","Orange","Strawberry"));
        System.out.println(groceriesList);
        groceriesList.retainAll(Arrays.asList("Eggs","Potato","MIlk"));

        System.out.println("groceriesList = " + groceriesList);




    }
}
