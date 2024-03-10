package day35_polymorphism;

import day34_abstraction.animalTask.*;

public class PolymorphismPractice {


    public static void main(String[] args) {


        Animal tiger = new Tiger("Sher KHan","Bengali",'M',4,"Large","Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        Animal animal = new Eagle("John","American Eagle",'M',6,"Small","Grey");

        //animal.fly()
         animal.eat();
         animal.drink();
         animal.sleep();

        Flyable obj = new Eagle("John","American Eagle",'M',6,"Small","Grey");

         obj.fly();


        System.out.println(obj);

        System.out.println("--------------------------------------");

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Dog dog = null;

        Cat cat = null;


        Eagle eagle = null;

        Flyable[] birds = {parrot,eagle};

        Playable[] friendly = {dog,cat};

        System.out.println(friendly);


boolean isAnimal = dog instanceof Animal;

        System.out.println(isAnimal);
        System.out.println("-------------------------------------------------------------");





    }

}
