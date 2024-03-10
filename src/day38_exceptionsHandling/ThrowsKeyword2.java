package day38_exceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) {




    }

    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }



    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");


        Thread.sleep(3000);

        System.out.println("First Program ended");

        new FileInputStream(" ");


        Thread.sleep(5000);




    }




}
