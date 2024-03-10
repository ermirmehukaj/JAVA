package day15_WhileLoop;

public class BreakStatment {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i == 5){
                break;
            }

            System.out.println(i);

        }
        System.out.println("--------------------------------------");

        for (char i = 'A'; i<='Z'; i++){
            if(i == 'G'){
                break;
            }

            System.out.println(i);
        }




    }
}
