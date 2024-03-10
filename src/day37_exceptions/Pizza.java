package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping,numberOfPepperoniToping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniToping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniToping(numberOfPepperoniToping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniToping() {
        return numberOfPepperoniToping;
    }

    public void setNumberOfPepperoniToping(int numberOfPepperoniToping) {
        this.numberOfPepperoniToping = numberOfPepperoniToping;
    }


    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniToping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniToping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniToping);
                break;

            default:
                System.err.println("Invalid size: "+size);

        }

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniToping +
                ", total price=" + calcCost() +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pizza)){
            System.err.println("Invalid Object, Object must be Pizza ");
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj;

        if(size == pizza.size){
            if(numberOfPepperoniToping == pizza.getNumberOfPepperoniToping()){
                return true;
            }

        }
        return false;
    }
}
/*

 */