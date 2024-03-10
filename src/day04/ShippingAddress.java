package day04;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Aaron Kissinger";
        int buildingNumber = 13621 ;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030;

        System.out.println( name );
        System.out.println(buildingNumber + " " + streetName);
        System.out.println(city + "," + state + " " + zipCode);
    }
}
