package day06_IfStatement;

public class Cigaretess {
    public static void main(String[] args) {
        int age =50;

        if(age >=21 && age <100){
            System.out.println("isEligebele to buy cigaretess");
        }
        if(age < 21 || age > 100){
            System.out.println("is not eligible to bbuy cigaretess");
        }


    }
}
