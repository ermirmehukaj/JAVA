package day40_collections;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(10,10,20,30,40,30,76,56));
        System.out.println(collection);

        System.out.println(((ArrayList) collection).get(3));

       //System.out.println(((Stack)collection).pop());


        System.out.println("-----------------------------------------------------------");

        Collection<Integer> collection1 = new HashSet<>();
        collection1.addAll(Arrays.asList(10,10,20,30,40,30,76,56));

        System.out.println(collection1);

        //System.out.println(((ArrayList)collection1).get(4));

        System.out.println(new ArrayList<>(collection1).get(4));

        List<Integer> l = new ArrayList<>(collection1);

    }
}
