package day38_exceptionsHandling;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person = new Person("Ermir",31,'M');


        System.out.println(person);
try {
    person.setAge(-25);
}catch (RuntimeException e){
    e.printStackTrace();
}

        System.out.println(person);

    }






}
