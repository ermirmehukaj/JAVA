package day39_colletctions.multiThreading;

public class ThreadHelloWorld extends Thread{
     int threadNumber;

     public ThreadHelloWorld(int threadNumber){
         this.threadNumber = threadNumber;
     }


    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello world " + threadNumber);
        }
    }
}
