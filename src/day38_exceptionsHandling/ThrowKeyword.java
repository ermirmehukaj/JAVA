package day38_exceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age ");

        int age = new Scanner(System.in).nextInt();

        if(age >120 || age <0){
            if(age<0){
            throw new InputMismatchException("Age of person cannot be negative");
        }else {
                throw new InputMismatchException("Age of the person cannot be up too 120");
            }
        }

        if(age >=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

        System.out.println("-------------------------------------------------------");


        throw new RuntimeException("Runtime exception");





    }
}
