package day25_Constructors;

import java.time.LocalDate;

public class TestEmployeeObject {

    public static void main(String[] args) {


        Employee obj = new Employee("Ermir",31,'M',"Developer",95000, LocalDate.of(2023,9,2));


        System.out.println(obj);







    }



}
