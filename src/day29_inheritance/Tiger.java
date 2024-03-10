package day29_inheritance;

public class Tiger extends Animal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }
}
