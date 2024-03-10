package day06_IfStatement;

public class NUmberOfDays {
    public static void main(String[] args) {
        int month = 13;
        boolean has28 = month ==2;
        boolean has30 = month == 4 || month == 6|| month ==9 || month ==11;
        boolean has31 = !has30 && !has28;
        if(has28){
            System.out.println("28 days");
        }
        if(has30){
            System.out.println("30 days");
        }
        if(has31){
            System.out.println("31 days");
        }
    }
}
