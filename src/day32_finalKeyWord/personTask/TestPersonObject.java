package day32_finalKeyWord.personTask;

import java.time.LocalDate;

public class TestPersonObject {


    public static void main(String[] args) {

        Person person = new Person("Ermir",'M', LocalDate.of(1992,11,5));

        System.out.println(person);
           person.breath();
        System.out.println("---------------------------------------------------");


        Employee employee = new Employee("MUhtar",'M',LocalDate.of(1990,4,23),"Developer",100000);


        System.out.println(employee);
        employee.breath();



    }
}
