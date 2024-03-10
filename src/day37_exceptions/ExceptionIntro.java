package day37_exceptions;

public class ExceptionIntro {

    public static void main(String[] args) {


        String str = "Java";

        char ch = str.charAt(2);

        System.out.println("ch = " + ch);

        System.out.println("---------------------------------------------------------");

        int score = 100;

        if(score>59){
            System.out.println("your grade is D");
        } else if (score>80) {
            System.out.println("your grade is C");
        }

        System.out.println("---------------------------------------------------------");

    }
}
