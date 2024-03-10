package day12_costumMethods;


import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = input.next();

        System.out.println("Enter last name:");
        String lastName = input.next();

        input.close();

        String fullName = firstName.toUpperCase().charAt(0)+ firstName.toLowerCase().substring(1) + " " +

                       lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);

        System.out.println(fullName);





    }
}
