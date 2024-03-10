package day33_abstraction;

import day32_finalKeyWord.personTask.Person;

import java.time.LocalDate;

public final class CydeoStudent extends Person{

    private final String id;
    private String batchName;
    private int batchNumber;

    public static final String programminglanguage;

    public CydeoStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {

        super(name, gender, dateOfBirth);
        if(getAge()<18){
            System.err.println("Cydeo developer student must be 18 years old");
            System.exit(1);}
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }


static {

        programminglanguage = "Java";
}

    private String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("zero to hero")||batchName.equalsIgnoreCase("alumni dev")){
        this.batchName = batchName;
    }else {
            System.err.println("Invalid batchName: "+batchName + "\n no such a batch in Cydeo");
            System.exit(1);
        }}

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid batch number: "+batchNumber + "\n no such a batch number in Cydeo");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }


    @Override
    public void eat() {
        System.out.println(getName()+ " is eating " + programminglanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " is drinking " + programminglanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ",  id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }




}
