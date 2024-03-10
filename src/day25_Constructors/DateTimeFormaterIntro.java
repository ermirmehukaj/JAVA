package day25_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yy,EEEE");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2023,7,1);

        System.out.println(date1.format(df));
        System.out.println("-------------------------------------------------------");


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");

        LocalTime time1 = LocalTime.of(7,5);

        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd/MMM/y  hh:mm a");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(dtf));




    }
}
