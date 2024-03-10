package day27_accsesModifier;

public class StaticBlock_VsInstanceBlock_Constructor {

    public StaticBlock_VsInstanceBlock_Constructor(){
        System.out.println("Constructor");
    }

    {

        System.out.println("Instance Block");


    }

    static {

        System.out.println("Static Block");



    }


    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_VsInstanceBlock_Constructor();
        new StaticBlock_VsInstanceBlock_Constructor();







    }







}
