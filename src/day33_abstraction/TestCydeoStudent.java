package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoStudent {
    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Ermiri", 'M', LocalDate.of(1992, 11, 5), "E22", "Alumni dev", 2);


        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.breath();
        student1.sleep();


    }
}
