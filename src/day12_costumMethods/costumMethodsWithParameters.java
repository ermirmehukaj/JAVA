package day12_costumMethods;

public class costumMethodsWithParameters {
    public static void main(String[] args) {

oddOrEven(13);

        System.out.println("----------------------------");

        oddOrEven(10000);

        isEligible( 35);
    }


    // the method takes an argument number, and verifies is odd or even number
    public static void oddOrEven(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
        // create a method is a person is eligible to buy alcool

        public static void isEligible(int age){

            if(age >= 21){
                System.out.println("is eligibel to buy alcool");
            }else {
                System.out.println("not eligiebel");
            }

        }

















}
