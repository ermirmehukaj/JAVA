package day32_finalKeyWord;

import java.time.LocalDate;


class CydeoStudent{

    public final void language(){
        System.out.println("Java Programming");
    }


}



public class FinalKeyword extends CydeoStudent{

    //  public void language(){
     //   System.out.println("Python programming");
  //  }

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);

      //  gender ='F';
        System.out.println(gender);

        System.out.println("---------------------------------------");

        final LocalDate dateOfbirth = LocalDate.now();

        System.out.println(dateOfbirth);
       // dateOfbirth = dateOfbirth.plusDays(3);
        System.out.println(dateOfbirth);
        System.out.println("---------------------------------------");

       new CydeoStudent().language();
        new FinalKeyword().language();

        System.out.println("------------------------------------------------");

       final String name = "James";
      //  name = null;
         // name = "Daniel";
        System.out.println(name);




    }


}
