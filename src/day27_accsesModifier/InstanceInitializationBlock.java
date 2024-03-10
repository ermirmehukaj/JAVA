package day27_accsesModifier;

public class InstanceInitializationBlock {

    public String name;
    public int age;

  /*  {
        name = "JAmes";
        age = 20;


    }*/

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {


       /* InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);

        System.out.println(obj2.name);*/
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("james",25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron",25);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }



}
