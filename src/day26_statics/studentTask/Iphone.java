package day26_statics.studentTask;

public class Iphone {
    public static String brand = "Apple";// static:all the iphone objects brand is apple


    public String model;//i instance : diffrent models for iphone objects
    public String color;
    public double price;

    public static String OS = "iOS";

    public static String madeIN = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;


    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("Color: " + color);
        System.out.println("price: " + price);
    }
public static void  printOperatingSystem(){
    System.out.println("Operating system: " + OS);
}


}
