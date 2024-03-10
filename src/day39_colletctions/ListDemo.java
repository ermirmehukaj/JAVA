package day39_colletctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.get(0);

        List<Integer> linkedList = new ArrayList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

       linkedList.get(0);


        System.out.println("0--------------------------------------------------------");


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);


        System.out.println("----------------------------------------------------");

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);


        int lastElement =  stack.pop();

        System.out.println(stack);

        stack.push(25);
        System.out.println(stack);






    }


}
