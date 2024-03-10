package day30_inheretance;

import java.time.LocalDate;

public class Teacher extends Employee{


    public Teacher(String name, char gender, LocalDate DOB, String employeeID, String jobTitle, double salary) {
        super(name, gender, DOB, employeeID, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");

    }

}
