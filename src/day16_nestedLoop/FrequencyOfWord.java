package day16_nestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {




        String sentece = "Java java JavA JaVa";
        String word = "Java";
        sentece = sentece.toLowerCase();
        word = word.toLowerCase();


       int count = 0;

       while (sentece.contains(word)){
           count ++;
          sentece = sentece.replaceFirst(word, "");
       }


        System.out.println(count);




    }
}
