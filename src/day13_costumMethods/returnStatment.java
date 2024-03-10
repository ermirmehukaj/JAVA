package day13_costumMethods;

public class returnStatment {
    public static void main(String[] args) {

        System.out.println(multiplication(7,7));

eligible(15);

    }


    public static void eligible(int age){
        if(age< 0 || age>150){
            System.err.println("invalid age " + age);
            return;// exits the method
        }// if the age is invalid than tis method is terminated


        if(age>=21){
            System.out.println("you are eligible to buy alcool");
        }else {
            System.out.println("you are not eligible to buy alcool");
        }
    }


    public static int multiplication(int n1,int n2){
        int result = n1 * n2;
        return result;// returns the value
    }






}
