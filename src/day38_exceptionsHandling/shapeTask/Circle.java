package day38_exceptionsHandling.shapeTask;

public class Circle {


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShapeException("Radius cannot be 0 or negative " + radius);
        }
        this.radius = radius;
    }
}
