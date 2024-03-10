package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int [ ] scores = {70,100,80,90,65};


        System.out.println(Arrays.toString(scores));

        System.out.println("---------------------------------");


        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 =Arrays.equals(a1,a2);

        System.out.println(r1);


        char[] ch = {'A','B','C'};
        char[] ch1 = {'A', 'C', 'B'};

        boolean a3 = Arrays.equals(ch,ch1);
        System.out.println(a3);


        System.out.println("---------------------------------");

        int[] nums = {100, 78 , 90, 45, 69, 36,7,2,0};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("minimum number is " + nums[0]);
        System.out.println("maximum number is " + nums[nums.length -1]);

        System.out.println("---------------------------------");

        char[] b1 = {'A','B','C'};
        char[] b2 = {'A', 'C', 'B'};



        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1,b2));


        System.out.println("---------------------------------");



        String[] students = {"Yaxier","Madyiak", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));

         Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------");


        int[] array = {10,20,30,40,50};

        int[] array2 = Arrays.copyOf(array, 10);

        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {4,5,6,7,8,9,9};

        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);

        for (int i = 0,j = n1.length; i < n2.length; i++,j++) {
            n3[j] = n2[i];
        }


        System.out.println(Arrays.toString(n3));



        System.out.println("---------------------------------");


        char[] c1 = {'A', 'B', 'C','D','E','F','G'};
        char[] result = Arrays.copyOf(c1, 4);

        System.out.println(Arrays.toString(result));


        char[] result2 = Arrays.copyOfRange(c1, 2,6);


        System.out.println(Arrays.toString(result2));






    }




}
