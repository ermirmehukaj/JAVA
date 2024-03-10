package day27_accsesModifier;

public class Circle {

    public double radius;
    public double diameter;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
       diameter = radius *2;
    }


/*public static double calcArea(){

        return radius * radius * pi;// static only accepts static
}*/

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }

   public static void printPiValue(){
       System.out.println("PI value is: " +  pi);
   }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +

                '}';
    }
}
