package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {


    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("A02","Abidullah");
        map.put("D02","Tatiana");
        System.out.println(map.size());
        System.out.println("map = " + map);

        System.out.println(map.get("D02"));
        map.put("D02","Lucy");
        System.out.println(map);

        map.replace("C02","Aseel");
        System.out.println(map);

        map.remove("D02");

        System.out.println(map);


        System.out.println(map.containsKey("A02"));

        System.out.println(map.containsValue("Nora"));

        System.out.println(map.isEmpty());

        System.out.println(map.equals(map));

       map.clear();

        System.out.println(map);



    }
}
/*

 */