package day30_inheretance;

public class TestPhoneObject {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("ProMax","Large",1000,"Black");
        Samsung smasung1 = new Samsung("Ulta","Normal",800,"Black");
        Nokia nokia1 = new Nokia("Brick","Small",50,"Pink");

iphone1.call(911);
smasung1.call(911);
nokia1.call(911);

        System.out.println("------------------------------------");
        iphone1.faceTime(12345678);
        smasung1.freeze();
        //iphone1.freeze();
        //nokia1.freeze();

        nokia1.selfDefense();
        //smasung1.selfeDefense();
          //iphone1.selfDefense();
        System.out.println(iphone1);
        System.out.println(smasung1);
        System.out.println(nokia1);




    }

}
