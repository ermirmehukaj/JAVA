package day30_inheretance;

import java.time.LocalDate;

public class TestPersonObject {


    public static void main(String[] args) {

        Student student = new Student("Lucy",'F', LocalDate.of(1990,5,23),'A',"A01");
        President president = new President("Daniel",'M',LocalDate.of(1980,2,21),LocalDate.of(2020,1,2));
        Teacher teacher = new Teacher("Emily",'F',LocalDate.of(1985,5,12),"A21","Java Developer",30000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

student.study();
teacher.teach();
president.lie();

student.eat("Baklava");
teacher.eat("kebab");
president.eat("Donut");





    }




}
