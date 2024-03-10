package day35_polymorphism.trasnportation;

public class Tesla extends Car implements Electric,AutoPilot{
    @Override
    public void charge() {
        System.out.println("with bateries");
    }

    @Override
    public void autoPark() {
        System.out.println("AutoPark is inherted inside the car");
    }

    @Override
    public void selfDrive() {
        System.out.println("SelfDrive is inherted on Tesla Car");
    }

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
