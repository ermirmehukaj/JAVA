package day38_exceptionsHandling;

public class Person {
    private String name;
    private int age;
    private  final char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender == 'M'|| gender == 'F' )){
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("AGe has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age >150 || age<0){
            throw new IllegalArgumentException("Invalid Age" + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
