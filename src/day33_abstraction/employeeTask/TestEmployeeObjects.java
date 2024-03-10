package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("James",45,'M',"A11","Math Teacher",30000);


          Developer developer = new Developer("Ermir",31,'M',"E22","Developer",50000,"Java");
          Driver driver  = new Driver("Muhtar",34,'M',"E34","Instructor",100000);
          Tester tester = new Tester("Edi",29,'M',"A23","Tester",70000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);


        System.out.println("-------------------------------------------");


        teacher.work();
        developer.work();
        driver.work();
        tester.work();










    }
}
