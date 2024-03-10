package day36_polymorphism;

import day29_inheritance.Animal;
import day29_inheritance.Cat;
import day29_inheritance.Dog;
import day30_inheretance.Nokia;
import day30_inheretance.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Employee;
import day35_polymorphism.trasnportation.AutoPark;
import day35_polymorphism.trasnportation.AutoPilot;
import day35_polymorphism.trasnportation.Electric;
import day35_polymorphism.trasnportation.Tesla;

public class ReferenceTypesCasting {


    public static void main(String[] args) {


        //Animal animal = new Dog();// implicit casting

        System.out.println("----------------------------------------------------");
        Animal animal = new Dog("Max","Husky",'M',6,"Large","White");
        animal.eat();
        animal.drink();
        animal.sleep();

        ((Dog)animal).bark();


        //((Cat)animal).scratch(); //Dog can not be converted to cat because is no 'is a' relationship betwen them


        System.out.println("--------------------------------------------------------------------");

        Phone pohne = new Nokia("XR20", "Small", 350, "Black");

         pohne.call(911);
         pohne.call(12345566);


         ((Nokia) pohne).selfDefense();

        System.out.println("--------------------------------------------------------------------");


        Employee employee = new Developer("Ermir",31,'M',"E22","Developer",50000,"Java");

      employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());

        System.out.println("----------------------------------------------");


        Electric electric = new Tesla("Tesla","Tesla Y","White",2020,40000);

       electric.charge();

        ((Tesla)electric).selfDrive();

        ((AutoPilot)electric).selfDrive();



    }
}
