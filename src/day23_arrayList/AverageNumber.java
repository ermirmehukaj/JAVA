package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();


        num.add(20);
        num.add(6);
        num.add(28);
        num.add(78);
        num.add(92);


        int sum = 0;
        for (Integer each : num) {
            sum += each;
        }

     double average = sum / num.size();
        System.out.println(average);

    }
}
