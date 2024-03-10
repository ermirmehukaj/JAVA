package day13_costumMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {
   //int total = sum(28,40); // sum is a void method, does not return a value

       int total = addition(3,5);
square(10);

        System.out.println(square(10));


    }

  /*  public static void sum(int n1 , int n2){
        int result = n1 +n2;
        System.out.println(result);
    }*/

    public static int addition(int n1 , int n2){
        return  n1 + n2;

    }

    public static int square(int num){
        int square = num *num;
        return square;
    }

public static int cube(int num){
        int cube = square(num) * num;
        return cube;
}





}
