package day15_WhileLoop;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min =  2147483647;//any integer number that user enters will always be smaller than this  numebr

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number ");
            int num = input.nextInt();
            if( num < min){
                min = num;
            }
        }

        System.out.println("minimum number is: "+ min);


    }
}
