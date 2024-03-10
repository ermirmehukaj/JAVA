package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

int [] numbers = {10,20,30,40,50};


       boolean has25 =  ArraysUtility.contains(numbers,25);

        System.out.println(has25);

        System.out.println("-------------------------------------");


String [] students = {"Sumeye","Hamza","Ermir"};

  boolean isKashyara = ArraysUtility.contains(students,"Kashyara");

        System.out.println(isKashyara);

        System.out.println("--------------------------------------");



    }
}
