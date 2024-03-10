package day37_exceptions;

public class TryCatchBlocks2 {


    public static void main(String[] args) {


        int[] array = {1,2,3,4,5};
try{
    System.out.println(array[100]);
}catch (RuntimeException e){
         e.printStackTrace();
}
        System.out.println("Program is ended");

        System.out.println("----------------------------------------------------------");


        System.out.println("Program2 started");
       try {
           System.out.println(9/0);

       }catch (RuntimeException e){
           e.printStackTrace();
       }
        System.out.println("Ermiri");
    }
}
