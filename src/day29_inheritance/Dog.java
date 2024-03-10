package day29_inheritance;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
  /*  public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);

        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);




    setInfo();
    eat();
    drink();
    toString();
    sleep();







    }*/

public void bark(){
    System.out.println(getName() + " is barkign");
}

    }

