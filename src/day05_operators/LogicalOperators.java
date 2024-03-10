package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650; // true
        System.out.println(eligibleForLoan);

        int age = 18;
        String country = "usa";

        boolean canVote = age >= 18 && country == "usa"; //true

        System.out.println(canVote);

        System.out.println("----------------------------------");

        String place = "Gjilan";
        int man = 18;

        boolean aOshtBurre = place == "Prishtine" || man >= 28; // false

        System.out.println(aOshtBurre);

        System.out.println("-----------------------------------------");

        System.out.println(!true);

        String a = "yes";

        boolean yes = a == "yes"; //true
        boolean no = !yes; // false

        System.out.println("------------------------------");

        int score = 65;

        boolean passed = score >=60;
        boolean failed = !passed;

        System.out.println(passed);
        System.out.println(failed);


    }
}
