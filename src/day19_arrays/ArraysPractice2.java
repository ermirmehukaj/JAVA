package day19_arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        
        int number[] = new int[100];

        for (int i = 0; i < number.length; i++) {
            number[i]= i+1;
        }

        System.out.println("number = " + Arrays.toString(number));

        System.out.println("-----------------------");
        
        int arr2[] = new int[100];

        for (int i = 0, j=100; i < arr2.length; i++,j--) {
            arr2[i] = j;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100 -i;
        }


        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


        int[] num = {5,7,10,56,8};


        int max = 0;
        for(int i = 0; i < num.length; i++ ) {

            if( num[i] >= max ){
                max = num[i];
            }
            
        }

        System.out.println(max);
        
    }}

