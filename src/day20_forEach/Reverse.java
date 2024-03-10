package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] reverse = new int [array.length];

        for (int i = array.length - 1,k=0; i >= 0; i--,k++) {
             reverse[k] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------------------------");

        int[] nums = {100,200,300,400,500};

        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------------------");

        double[] a1 = {6.1,7,2,8.3,9.7,0.5};
        a1 = ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));


        String[] arr = {"java", "python", "c#"};

        for (int i = 0; i < arr.length; i++) { //we gonna use nested loop, first we are creating a loop for iterating the elements of array
            String name = arr[i];//assigning index[i] of array to a String so we can use it for reversing the String
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {//j starting from a last index of a String we will iterate it to get the reverse order and concate it into our reverseName
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

        }





    }
}
