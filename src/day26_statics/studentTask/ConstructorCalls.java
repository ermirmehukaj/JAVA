package day26_statics.studentTask;

public class ConstructorCalls {

    public ConstructorCalls(){


        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("argument");

    }

    public ConstructorCalls(double b){
        System.out.println("double argument");
    }

    public ConstructorCalls(String c){
        this();
        
        System.out.println("String");
    }


    public static void main(String[] args) {
        method1();
        System.out.println("---------------------------------");

       method2();
    }

    public static void method1(){
        System.out.println("method1");
    }

    public static void method2(){
        method1();

        System.out.println("Method2");
    }

}
