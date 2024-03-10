package day40_collections;

import java.util.*;

public class IterablePractice {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed","ahmed","aHmeD","John","Ercon","Daniel","Mustafa","Mohammed"));

        Iterator<String> it = names.iterator();

         while (it.hasNext()){
             String each = it.next();
         if(each.equalsIgnoreCase("ahmed")){
             it.remove();
         }
         }
        System.out.println(names);


        System.out.println("---------------------------------------------------------------------------");

        List<String> names1 = new ArrayList<>();

        names1.addAll(Arrays.asList("Ahmed","ahmed","aHmeD","John","Ercon","Daniel","Mustafa","Mohammed"));
        names1.removeIf(p->p.equalsIgnoreCase("ahmed"));


        System.out.println(names1);


        System.out.println("---------------------------------------------------------------------");


        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,3,4,5,2,1,3,4,6,8,9,98,7,7,9));

        int n =5;



        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p-> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);
        System.out.println(max);


    }
}
