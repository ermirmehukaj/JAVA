package day10_scanner_string;

import java.util.Scanner;

public class Shippinf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your builiding number: ");
        String buildingNumber = input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String stateName = input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();

        System.out.println("your shipping address is: ");
        System.out.println( full_name);
        System.out.println(buildingNumber);
        System.out.println( stateName);
        System.out.println(cityName);
        System.out.println(stateName);
        System.out.println(zipCode);

        input.close();


    }
}
