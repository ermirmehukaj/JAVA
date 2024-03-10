package day19_arrays;

import java.util.Arrays;

public class Alphabets {


    public static void main(String[] args) {


        char ascending[] = new char[26];
        char decending[] = new char[26];

        for (int i = 0, j = 'A',k = 'Z'; i < ascending.length; i++,j++,k--) {
            ascending[i] = (char)j;
            decending[i] = (char)k;
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(decending));


        System.out.println("------------------------------------------");








    }
}
