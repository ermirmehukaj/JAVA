package day12_costumMethods;

public class costumMethodsPractice {
    public static void main(String[] args) {

        maximumNumber(7,9);


        
    }

    public static void maximumNumber(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " is maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum number");
        }else{
            System.out.println("Equal");
        }
    }







}
