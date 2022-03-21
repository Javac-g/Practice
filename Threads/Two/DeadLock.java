package Threads.Two;

public class DeadLock implements Runnable {

     private One one = new One();

     private Two two = new Two();

     private DeadLock(){

            Thread.currentThread().setName(" Главный поток ");

            Thread t = new Thread(this," Соперничающий поток ");

            t.start();

            one.first(two);

            System.out.println(" Назад в главный поток ");
     }

     public void run(){

            two.Second(one);

            System.out.println(" Назад в другой поток ");
     }

     public static void main(String...args){

            new DeadLock();
     }
}
