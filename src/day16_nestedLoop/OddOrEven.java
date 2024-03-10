package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if(number % 2 ==0){
                System.out.println(number +" Even number ");
            }else{
                System.out.println(number + "Odd number");
            }

            System.out.println("Would you like to enter another number? YesorNo");
            String enswer = input.next().toLowerCase();

            while (!(enswer.equals("yes") || enswer.equals("no"))){
                System.err.println("Invalid entry. Would you like to enter another number? YesorNo");
                 enswer = input.next().toLowerCase();
            }



            if(enswer.equals("no")){
                break;
            }


        }







    }
}
