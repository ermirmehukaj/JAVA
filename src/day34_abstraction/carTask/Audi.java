package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }
public void autoPark(){
    System.out.println( getMake() + " " + getModel() + " has auto park feature");
}

}
