package day13_costumMethods;

import java.util.Scanner;

public class returnStatmentPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if(number<1 || number>7){
            System.err.println("invalid number "+ number);;
            return;
        }
        if(number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("wednesday");
        }else if(number == 4){
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        }else {
            System.out.println("Sunday");
        }

    }


}
