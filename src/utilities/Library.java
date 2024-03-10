package utilities;

public class Library {


    public static void sleep(double seconds) throws InterruptedException{

     try{
         Thread.sleep((long)(seconds * 1000));
     }catch (InterruptedException e){
         throw new RuntimeException(e);

     }


    }


}
