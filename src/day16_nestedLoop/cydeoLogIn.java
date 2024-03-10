package day16_nestedLoop;

import java.util.Scanner;

public class cydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = input.next();

        System.out.println("Enter password");
        String password = input.next();


        if(userName.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {

            for (int i = 0; i < 3; i++) {
                if(i != 2){
                    System.err.println("Incorrect username or passwrod , please re-enter");
                }else {
                    System.err.println("This is your last attempt, please re-enter your username and password");
                }


                System.out.println("Enter username");
                userName = input.next();

                System.out.println("Enter password");
                password = input.next();

                if(userName.equals("Cydeo")&&password.equals("WoodenSpoon")){
                    System.out.println("You are logged in");
                    break;
                }

            }

            if(!(userName.equals("Cydeo")&&password.equals("WoodenSpoon"))){
                System.err.println("Your account is locked, please contact with support team");


             input.close();

            }


        }









    }
}
