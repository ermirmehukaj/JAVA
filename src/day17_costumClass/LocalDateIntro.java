package day17_costumClass;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(2008,05,25);

        System.out.println(birthday);
        System.out.println("----------------------------------------");

        System.out.println(today.getYear());

        System.out.println("----------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));

        System.out.println("----------------------------------------");


        System.out.println(LocalDate.of(2023,12,23).isLeapYear());



    }
}
