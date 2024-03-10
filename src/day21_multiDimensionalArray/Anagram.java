package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart"; // two given
        String str2 = "earth"; // strings

       //String[] a1 = str1.split("");
         char[] a1 = str1.toCharArray();//turn string into array and  accses in characters
        char[] a2 = str2.toCharArray();//turn string into array and  accses in characters

           Arrays.sort(a1);// using sort method to order letter from a to z
           Arrays.sort(a2);// using sort method to order letter from a to z

        boolean isAnagram = Arrays.equals(a1,a2); // turn a value true or false
        System.out.println(isAnagram);










    }
}
