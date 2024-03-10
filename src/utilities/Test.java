package utilities;
import day27_accsesModifier.AccessModifiers;
import day27_accsesModifier.Date;
public class Test {

    public static void main(String[] args) {

        System.out.println(Date.d);
        System.out.println(Date.e);
        System.out.println(Date.f);


        Date.method4();
        Date.method4();

        Date obj = new Date();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("--------------------------------------------------");

        System.out.println(AccessModifiers.publicDate);

       // System.out.println(AccessModifiers.protectedData);

        //System.out.println(AccessModifiers.defaultData);

        //System.out.println(AccessModifiers.privateData);

new AccessModifiers();
    }
}
