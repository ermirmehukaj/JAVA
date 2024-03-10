package day36_polymorphism;

import java.nio.file.Watchable;

public class TestEqualMethod {
    public static void main(String[] args) {


        Circle circle = new Circle(6);
        Circle circle1= new Circle(6);
        Circle circle2 = new Circle(15);

        System.out.println(circle == circle1);

        System.out.println(circle.equals(circle1));
        System.out.println(circle.equals(circle2));


        System.out.println("----------------------------------------------");


        IPhone iPhone = new IPhone("Apple","Iphone 12","Medium",900,"Black");
        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", 1000, "White");

        System.out.println(iPhone.equals(iphone2));

    }
}
