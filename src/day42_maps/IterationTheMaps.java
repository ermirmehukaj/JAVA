package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IterationTheMaps {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        for (String each : map.keySet()) {// iteration the ma by the keys
            //map.replace(each,map.get(each) *2);
            System.out.println(each);


        }


        System.out.println("-----------------------------------------------------------");

        //Iterating the map by the values

        for (Integer eachvalue : map.values()) {
            System.out.println(eachvalue);
        }
        System.out.println("-------------------------------------------------------------------");

        //Iterating by entry
        for (Map.Entry<String, Integer> eachEntryy : map.entrySet()) {
            System.out.println(eachEntryy);

            System.out.println("-----------------------------------------------------------");

            for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
                String eachkey = eachEntry.getKey();
                Integer eachValue = eachEntry.getValue();
                eachEntry.setValue(eachValue + 10000);
                System.out.println(eachkey + " : " + eachValue);
            }
        }

        System.out.println(map);
    }
}
