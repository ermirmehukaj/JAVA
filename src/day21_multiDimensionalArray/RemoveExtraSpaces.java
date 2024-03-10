package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "   Hello world      I    love    Java    ";

        String[] words = str.split(" ");// turn string to an array and use split method to accses to every word and space
        str = "";// then declare a empty string


        for (String each : words) {// using for each loop to accses to every word in string array
            if(!each.isEmpty()){// cheking for words in string
                str += each + " " ;// then puting them on the empty string
            }
        }
         str = str.trim();// triming the space behind the sentence
        System.out.println(str);




    }
}
