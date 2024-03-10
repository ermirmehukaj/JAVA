package day28_encapsulation.personTask;

public class TEstEmployeeObject {

    public static void main(String[] args) {

      /*  Employee employee1 = new Employee();
employee1.setSalary(90000);
        System.out.println(employee1.getSalary());

     employee1.setName("Ermiri");
        System.out.println(employee1.getName());

    }*/
Employee employee1 = new Employee("Ermir",31," Java Developer",100000);
        System.out.println(employee1.getName());


        System.out.println(employee1);
    }



}