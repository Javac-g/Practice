package Threads.Train_03_29_22;

public class Run {

    public static void main(String...args){

        FirstType one = new FirstType("First");
        Second two  = new Second("Second");
        one.start();
        System.out.println(one.name + " is alive: " + one.t.isAlive());
        System.out.println(two.name + " is alive: " + two.t.isAlive());

        try{
            one.t.join();
            two.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(one.name + " is alive: " + one.t.isAlive());
            System.out.println(two.name + " is alive: " + two.t.isAlive());
        }

    }


}
