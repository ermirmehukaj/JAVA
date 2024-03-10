package day24_dateAndTime;

import day17_costumClass.Employee;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        for (Employee each : employees) {
            System.out.println(each.name + " : " + each.jobTitle);
        }


        System.out.println("-----------------------------------------------");

        for (Employee each1 : employees) {
            if(each1.jobTitle.equals("Java Developer")){// if the job tittle of each employee is java developer
                System.out.println(each1.name);
            }
        }
        System.out.println("--------------------------------------------");

           double max = employees.get(0).salary;
        double min = employees.get(0).salary;
        for (Employee each : employees) {
            if(each.salary > max){
                max = each.salary;
            }
        if(each.salary < min){
            min = each.salary;
        }
        

        }
        
        System.out.println(max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------");



        ArrayList<Employee> femaleEmployee = new ArrayList<>();
        ArrayList<Employee> maleEmployee = new ArrayList<>();


        for (Employee each : employees) {
            if(each.gender == 'M' ){
                maleEmployee.add(each);
            }else{
                femaleEmployee.add(each);
            }
        }

        System.out.println("Total number of female employees: " + femaleEmployee.size());
        System.out.println("Total number of male employees: " + maleEmployee.size());








    }
}
