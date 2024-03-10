package day25_Constructors;

public class Rectangle {

    public double lenght,width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }


    /*  public void setInfo(double lenght,double width){
        this.lenght = lenght;
        this.width = width;
    }*/

    public double area(){

        return lenght * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
