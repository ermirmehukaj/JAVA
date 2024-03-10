package day26_statics.studentTask;

public class ConstuctorCalls2 {

    public ConstuctorCalls2(){

        System.out.println("Default");
    }
    public ConstuctorCalls2(int a){
        this();//calling the default constructor
        System.out.println("int argument");
    }

    public ConstuctorCalls2(String a){
    this(9);
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstuctorCalls2 obj1 = new ConstuctorCalls2();

        System.out.println("-------------------------------------------------");
        ConstuctorCalls2 obj2 = new ConstuctorCalls2(9);

        System.out.println("-----------------------------------------------");

             ConstuctorCalls2 obj3 = new ConstuctorCalls2("Java");
}}