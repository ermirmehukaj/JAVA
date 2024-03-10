package day09_scaner;

import java.sql.SQLOutput;

public class IfAndSwitch {
    public static void main(String[] args) {
        int number = 75;

        if(number == 50 || number == 75 || number == 100){

            switch (number){

                case 50:
                    System.out.println(" 20 crew and 30 passengers");
                    break;
                case 75:
                    System.out.println("25 crew and 50 passenger");
                    break;
                default:
                    System.out.println("invalid number ");




            }




        }else {
            System.out.println("invalid number");
        }






    }
}
