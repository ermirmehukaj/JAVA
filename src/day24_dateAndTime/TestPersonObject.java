package day24_dateAndTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class TestPersonObject {

    public static void main(String[] args) {


        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Ermir", 'M', LocalDate.of(1992, 3, 5));
        people[2].setInfo("Muharrem", 'M', LocalDate.of(1960, 7, 2));
        people[3].setInfo("Armend", 'M', LocalDate.of(1986, 7, 17));
        people[4].setInfo("Gentiana", 'F', LocalDate.of(1995, 1, 20));




        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        System.out.println(studentsList);

        for (Person each : studentsList) {
            System.out.println(each.name + " :" + each.dateOfBirth);
        }


studentsList.removeIf(p -> p.dateOfBirth.getYear() <1968);
        System.out.println(studentsList);


    }
}
