package day13_costumMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(isEven(10));
        System.out.println(max(6,3));
    }
    public static boolean isOdd(int num ){
        return (num % 2 != 0)? true  : false;
    }
public static boolean isEven (int num){
       // return !isOdd(num);
        return (num % 2 == 0)? true  : false;
}


public static int max(int num1,int num2){
        if(num1 > num2){
            return num1;
        }
            return num2;

}





}
