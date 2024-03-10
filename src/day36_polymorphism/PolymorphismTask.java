package day36_polymorphism;
import day30_inheretance.Iphone;
import day30_inheretance.Nokia;
import day30_inheretance.Phone;
import day30_inheretance.Samsung;

public class PolymorphismTask {



    public static void main(String[] args) {


        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", 900, "Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 1200, "Black"),
                new Iphone("Iphone 9", "Medium", 800, "Gold"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Black"),
                new Nokia("XR20", "Small", 350, "Black"),
                new Nokia("G10", "Medium", 99, "Silver"),
                new Nokia("G50", "Large", 250, "Silver"),
                new Iphone("Iphone 12 Pro", "Large", 1200, "Black"),
                new Iphone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Iphone("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 650, "Silver"),
                new Nokia("G10", "Medium", 99, "Black"),
                new Iphone("Iphone 6", "Smalle", 400, "Gold"),
                new Iphone("Iphone 7", "Smalle", 500, "White")


        };

        for (Phone phone : phones) {
            System.out.println(phone.getModel() + " - " + phone.getColor() + " - " + phone.getPrice());
        }
        System.out.println("-----------------------------------------------------------");

         int count =0;
         int countSamsung = 0;

        for (Phone eachphone : phones) {
            if(eachphone instanceof Iphone){
                count++;
            }
            if(eachphone instanceof Samsung){
                countSamsung++;
            }
        }

        System.out.println(count);
        System.out.println(countSamsung);

        System.out.println("-----------------------------------------------------------");

        for (Phone eachphone : phones) {
            if(eachphone instanceof Iphone || eachphone instanceof Samsung){
                if(eachphone.getPrice() >= 700){
                    System.out.println(eachphone.getModel());
                }
            }
        }



    }
}
