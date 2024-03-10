package day27_accsesModifier;

public class InstanceBlock {
public InstanceBlock(){

    {
        System.out.println("Instance Block");

    }

    System.out.println("COnstructor");
}
    public static void main(String[] args) {


        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();




    }


}
