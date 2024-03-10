package day05_operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(a);

        System.out.println(a);

        a  = 40;
        System.out.println(a);

        System.out.println("-----------------------------------");

        double balance = 100;

        balance += 1000;// balance = 100 + 1000

        System.out.println(balance);

        balance += 500;

        System.out.println(balance);

        balance -= 100;

        System.out.println(balance);

        System.out.println("----------------------------------------");

        double salary = 45000;
        salary *= 2;

        System.out.println(salary);

        System.out.println("-------------------------------------------");

        int  b = 39;

        b %= 7;

        System.out.println(b);
    }
}
