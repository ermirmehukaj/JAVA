package day32_finalKeyWord.methodOverriding;

public class Audi extends Car{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("Press the start buttonto start "+ getMake() + " " + getModel());
    }
}
