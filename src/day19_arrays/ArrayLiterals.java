package day19_arrays;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int numbers [] = new int [5];

        int nums[] = {1,2,3,4,5};

        System.out.println(nums.length);
        System.out.println(numbers.length);


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------");


        String dayOfWeek[] = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        
        int n = 1;

        System.out.println(dayOfWeek[n-1]);


        System.out.println("-----------------------------------------------");
        
        String month[] = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        System.out.println("Arrays.toString(month) = " + Arrays.toString(month));

        System.out.println("-------------------------------------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }

    }
}
