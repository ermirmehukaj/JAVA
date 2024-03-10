package day40_collections;

import java.util.*;

public class QueueDemo {


    public static void main(String[] args) {



        Queue<Integer> queue = new PriorityQueue<>();

        queue.addAll(Arrays.asList(10,200,300,90,40,10));
        queue.addAll(Arrays.asList(10,200,300,90,40,10));
        queue.addAll(Arrays.asList(10,200,300,90,40,10));
        System.out.println(queue);


       int num = queue.poll();

        System.out.println(queue);

        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);


        System.out.println("------------------------------------------------");




        Queue<Integer> queue1 = new ArrayDeque<>();

        queue1.addAll(Arrays.asList(10,200,300,90,40,10));
        queue1.addAll(Arrays.asList(10,200,300,90,40,10));
        queue1.addAll(Arrays.asList(10,200,300,90,40,10));

        System.out.println(queue1);

        queue1.poll();

        System.out.println(queue1);


        System.out.println("--------------------------------------------------------------");

        Queue<Integer> queue2 = new LinkedList<>();



        queue2.addAll(Arrays.asList(10,200,300,90,40,10));
        queue2.addAll(Arrays.asList(10,200,300,90,40,10));
        queue2.addAll(Arrays.asList(10,200,300,90,40,10));

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        System.out.println(((LinkedList)queue2).get(2));


        System.out.println("------------------------------------------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,90,40,10));

        System.out.println(list.get(1));

        System.out.println(list);

        ((LinkedList)list).poll();//FIFO

        System.out.println(list);

        ((Stack)list).pop();









    }
}
