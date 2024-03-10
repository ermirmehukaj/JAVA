package day29_inheritance;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max","Husky",'M',6,"Large","White");

        Cat cat1 = new Cat("Felicia","Stray",'F',3,"Medium","Grey");

        Tiger tiger1 = new Tiger("SHere Khan","Bengal",'M',5,"Large","Orange");


        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(tiger1);
        System.out.println("------------------------------------------------------");

      dog1.sleep();
      dog1.eat();
      dog1.drink();

        System.out.println("-------------------------------------------------");
      dog1.bark();


      cat1.scratch();
      cat1.meow();


      tiger1.hunt();

        System.out.println(dog1.getSize());
        dog1.setGender('F');
        dog1.setAge(5);

        System.out.println(dog1);

        System.out.println("-------------------------------------------------------");
        String text = "How can mirrors be real if our eyes aren't real";
   String[] result = text.split(" ");


        for(String str : result){
            System.out.print(str.toUpperCase().charAt(0) + str.substring(1) + " ");
        }






    }
}
