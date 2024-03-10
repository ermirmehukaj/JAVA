package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {


      Dog dog =   new Dog("Max","Husky",'M',31,"Large","White");
     Cat cat =   new Cat("Max","Husky",'M',31,"Large","White");

        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;





Animal [] animals = {dog,cat,tiger,eagle,lion,parrot};


        System.out.println("-----------------------------------------------");


        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Honda honda = new Honda("Honda","Pilot","Black",2019,50000);
        Audi audi = new Audi("Audi","Q6","Silver",2020,30000);
        Tesla tesla = new Tesla("Tesla","Model Y","White",2021,70000);

       Object[] objects = {str,n,r,d,honda,audi,tesla};
Car car = new Audi("Audi","Q6","Silver",2020,30000);


        System.out.println(Arrays.toString(objects));


        System.out.println("---------------------------------------------------------");





    }


}