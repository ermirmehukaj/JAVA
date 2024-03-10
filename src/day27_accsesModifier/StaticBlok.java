package day27_accsesModifier;

public class StaticBlok {


    public StaticBlok(){
        System.out.println("Constructor");
    }

    static {

        System.out.println("Static Block");
    }


    public static void main(String[] args) {
        System.out.println("Main method");



        new StaticBlok();

    }


}
