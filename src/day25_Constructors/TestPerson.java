package day25_Constructors;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        Person obj = new Person("Ermir",31,'M', LocalDate.of(1992,11,5),true,true);


        System.out.println(obj);

        obj.eat(" meat");

    obj.sleeping();
    obj.drink(" water");

    }
}
