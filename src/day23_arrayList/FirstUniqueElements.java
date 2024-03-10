package day23_arrayList;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> unique = new ArrayList<>();

        unique.add(1);
        unique.add(1);
        unique.add(3);
        unique.add(2);
        unique.add(2);
        unique.add(5);
        unique.add(7);


        for (Integer element : unique) {

            int num = 0;

            for (Integer each : unique) {
                if (element == each)
                    num++;
            }
            if (num == 1) {
                System.out.println(element);
                break;
            }

        }


        }
    }
