package day34_abstraction.carTask;

public class TestCarObjects {


    public static void main(String[] args) {

        Honda honda = new Honda("Honda","Pilot","Black",2019,50000);
        Audi audi = new Audi("Audi","Q6","Silver",2020,30000);
        Tesla tesla = new Tesla("Tesla","Model Y","White",2021,70000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("----------------------------------------------");

        honda.stop();

        audi.stop();
        tesla.stop();

        System.out.println("----------------------------------------------");


        honda.start();
        audi.start();
        tesla.start();






    }
}
