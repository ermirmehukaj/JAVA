package day27_accsesModifier;

public class Car { // outer class

    public String make,model,color;

    public int year;
    public double price;
    public static int wheels = 4;

    public class CarEngine{ // Inner Class

        public void method(){

            System.out.println(make);
            System.out.println(wheels);
        }

    }

public static class StaticInerClass{
public void methods(){

    System.out.println(wheels);

}


}

}
