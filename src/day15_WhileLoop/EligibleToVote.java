package day15_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = input.nextInt(); // valid age : 1-120

        while (!(age>=1 && age<=120)){// while the age is not valid
            System.err.println("Invalid entry, please reenter your age: ");
             age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
       String usCitizen = input.next().toLowerCase();

       while (!(usCitizen.equals("yes")|| usCitizen.equals("no"))){// nqfs pergjigjja nuk osht as po as jo
           System.err.println("Invalid entry, Please reenter");
           System.out.println("Are you a US citizen? Yes/No?");
           usCitizen = input.next().toLowerCase();
       }

        if(age>= 21 && usCitizen.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }



    }
}
