package day19_arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1[] = new int[5];
        score1[2] = 3;
        score1[0] = 85;
        score1[1] = 75;
        score1[3] = 88;
        score1[4] = 95;




      //  score1 = new int[10];

        // score1 = new int[50];
        System.out.println( Arrays.toString(score1));
        System.out.println(score1[2]);


        for (int i = 0; i < score1.length; i++) {
            System.out.println(score1[i]);

        }

        System.out.println(score1[score1.length -1]);





    }
}
