package day28_encapsulation.personTask;

public class Employee {

    private String name;

    private int age;

    private String jobTitle;
    private double salary;


    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("job title of the employee can not be empty or blank");
             System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public String getName() {

        if(name == null){
            System.err.println("name cant be null");
        System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Employee name cant be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <0){
            System.err.println("Salary can not be negative "  + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
