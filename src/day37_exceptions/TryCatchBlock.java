package day37_exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {


        System.out.println("Program started");




        try{
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch(ArithmeticException e){
            System.out.println("Catch Block");
            e.printStackTrace();
        }


        System.out.println("Program ended");

    }







    
}
