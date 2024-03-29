package day37_exceptions;

import day35_polymorphism.trasnportation.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {




        Car car = null;

        try{
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch block");
             e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();

        }

        System.out.println("Program1 ended");

    }
}
