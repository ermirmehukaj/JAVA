package day19_arrays;

public class MaxNUmber {
    public static void main(String[] args) {

        int number [] = {100,20,300,-10,30};

        int max = number[0];

        for (int i = 1; i < number.length; i++) {
            if(number[i] > max){
                max = number[i];
            }
        }


        System.out.println("MAximum number is  " + max);

    }
}
