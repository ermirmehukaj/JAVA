package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;
public class MergeTwoArrays {

    public static void main(String[] args) {
    int arr1[] = {1,2,3,4};
    int arr2[] = {5,6,7};

    int arr3[] = new int [arr1.length + arr2.length];


        int k = 0;

        for (int i = 0; i < arr1.length; i++,k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {78,79,70};

    int[] a3 = ArraysUtility.merge(a1,a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("--------------------------------------------");

        double[] b1 = {10.5,7.5,6.3,4.5,5.7};
        double[] b2 = {28.5,15.5,13.5};

        double[] b3 = ArraysUtility.merge(b1,b2);

        System.out.println(Arrays.toString(b3));





    }



}
