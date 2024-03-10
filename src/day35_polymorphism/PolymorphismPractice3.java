package day35_polymorphism;

import day33_abstraction.employeeTask.*;

import java.util.ArrayList;

public class PolymorphismPractice3 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
        };

        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }

        System.out.println("-----------------------------------------------");

        int countDeveloper = 0,
             countTesters = 0,
                countTeachers=0,
                countDeiver = 0;

        for (Employee each1 : employees) {

            if(each1 instanceof Developer){// if the employee is developer
                countDeveloper++;
            } else if (each1 instanceof Tester) {
                countTesters++;
            } else if (each1 instanceof Teacher) {
                countTeachers++;
            }else {
                countDeiver++;
            }


        }

        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTesters = " + countTesters);
        System.out.println("countTeachers = " + countTeachers);
        System.out.println("countDeiver = " + countDeiver);

        System.out.println("---------------------------------------------------");

        for (Employee each : employees) {
            if(!(each instanceof Developer)){
                System.out.println(each.getName());
            }
        }

    }}