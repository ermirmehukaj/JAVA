package day19_arrays;

public class MinimumNumber {

        public static void main(String[] args) {

            int number [] = {100,20,300,-10,30};

            int min = number[0];

            for (int i = 1; i < number.length; i++) {
                if(number[i] < min){
                    min = number[i];
                }
            }


            System.out.println("minimum number is  " + min);

        }
    }




