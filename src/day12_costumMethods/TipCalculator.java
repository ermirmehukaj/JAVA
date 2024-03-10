package day12_costumMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or no split(Yes or No)");
        String yesNo = input.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double amount = input.nextDouble();

        System.out.println("How was the service quality?");
        String service = input.next().toLowerCase();

        input.close();

        double totalTip = (service.equals("excellent"))? amount * 0.25: (service.equals("great"))? amount * 0.2
                :(service.equals("good"))? amount * 0.15 :(service.equals("fair"))? amount * 0.1 : amount * 0.05;


        double totalToPay = amount + totalTip;

        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Total to pay " + totalToPay);
        System.out.println("Total tip: " + totalTip);


        if(yesNo.equals("yes")){
            System.out.println("Total per person" + totalToPay/numberOfPeople);
            System.out.println("Tip per person:" + (totalTip/numberOfPeople));
        }










    }
}
