package day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if ( i == 2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("===============================");
        for (int i = 10; i < 21; i++) {
            if(!(i % 2 ==0)){
                continue;
            }
            System.out.println(i);

        }




    }
}
