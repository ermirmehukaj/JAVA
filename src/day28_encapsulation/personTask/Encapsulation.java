package day28_encapsulation.personTask;

public class Encapsulation {

   private String name;
    private int age;


    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false;
        for (char c : name.toCharArray()) {
            if(Character.isDigit(c)){
                hasDigit = true;
                break;

            }
        }
            if(hasDigit){
                System.err.println("Invalid name");
                System.exit(1);
            }
        this.name = name;
    }

    public int getAge() {// Read Only - Data
       if(age == 0){
           System.err.println("Age has not been set");
       System.exit(1);
       }


        return age;
    }

public void setAge(int age){//Write the data
        if(age<6 && age >100){
            System.err.println("Invalid age " + age);
              //  return;
            System.exit(1);
        }

        this.age = age;
}
}
