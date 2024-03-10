package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for(int i = 10 ; i>= 5; i--){
            System.out.println("Hello Cydeo");
        }


        System.out.println("---------------------------------------");
               int sum = 0;
        for(int a = 1; a <= 100; a++){
            sum += a;

        }
        System.out.println(sum);

        for(char i = 'A'; i<= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println("-------------------------------------");

        for(char i = 'Z'; i>= 'A'; i--){
            System.out.print(i + " ");
        }



    }
}
