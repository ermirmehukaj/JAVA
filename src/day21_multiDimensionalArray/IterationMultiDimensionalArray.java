package day21_multiDimensionalArray;

import java.util.Arrays;

public class IterationMultiDimensionalArray {
    public static void main(String[] args) {



        int [][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};// index number of 1d array in arr2D

       for (int i = 0; i< arr2D.length; i++){

           int[] each1D = arr2D[i];
           System.out.println(Arrays.toString(each1D));

           for(int j = 0; j<each1D.length; j++){// index number of elements in each 1 dimensional array

               int eachElement = each1D[j];
               System.out.println(eachElement);

           }



       }


        System.out.println("--------------------------------------------------");


        for (int[] each : arr2D) {

            //System.out.println(Arrays.toString(each));
            for (int element : each) {
                System.out.println(element);
            }


        }





    }
}
