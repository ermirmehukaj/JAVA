package day16_nestedLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {


        for(int i = 1 ; i<6; i++){
            System.out.println("hello " + i);
        }
        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("hello " + i);
        }

        System.out.println("-----------------------------");
        int j = 0;
        while (j < 5){
            System.out.println("hello" + j);
                j++;
        }

        System.out.println("----------------------------");
        Scanner input = new Scanner(System.in);



        System.out.println("enter your score");
        int score = input.nextInt();

        input.close();
        while (score > 100 || score <0){
            System.out.println("Invalid score, please re-enter your score");
            score =  input.nextInt();
        }

        if(score>=60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
