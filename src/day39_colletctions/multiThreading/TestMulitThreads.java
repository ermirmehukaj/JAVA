package day39_colletctions.multiThreading;

public class TestMulitThreads {

    public static void main(String[] args) {

        ThreadHelloWorld thread = new ThreadHelloWorld(1);
        ThreadHelloWorld thread1 = new ThreadHelloWorld(2);

        thread.start();
        thread1.start();





    }





}
