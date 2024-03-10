package day31_inheretance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Emily","Benglee",'F',3,"Small","Grey");

        Dog dog = new Dog("Max","Husky",'M',5,"Large","WHite");

        Lion lion = new Lion("Simba","African LIon",'M',10,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","American Eagle",'F',2,"Small","Grey");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("------------------------------------");

        cat.eat();
dog.eat();
lion.eat();
eagle.eat();

        System.out.println("---------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();




    }

}
