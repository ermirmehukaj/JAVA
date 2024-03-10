package day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        int max =  -2147483648;// any integer number that user enters will always be greater than this negative numebr

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num > max){ // if the user entered entry is greater than the current maximum number that we have
                max = num;// then user entered number should be the maximum number

            }

        }

        System.out.println("max number is = " + max);

    }
}
