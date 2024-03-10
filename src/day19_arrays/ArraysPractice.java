package day19_arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String name[] = new String[5];

        name[0] = "Gylcin";
        name[name.length-1] = "Assel";
        name[2] = "Ermiri";
        name[1] = "Muhtar";
        name[3] = "Sumeye";

        System.out.println(Arrays.toString(name));

        name[1] = "Kuzzat";
        System.out.println(Arrays.toString(name));

        System.out.println("------------------------------");

        for (int i = name.length-1; i > 0; i--) {
            System.out.println(name[i]);


        }


        System.out.println("----------------------");







    }
}
