package Threads.Three;

public class runn {

    public static void main(String...args){
        One o1 = new One("ONE ");
        One o2 = new One("TWO ");

        try{
            Thread.sleep(1000);
            o1.suspend();
            System.out.println("ONE SUSPENDED");
            Thread.sleep(1000);
            o1.resume();
            System.out.println("ONE restarted");
            Thread.sleep(1000);
            o2.suspend();
            System.out.println("TWO SUSPENDED");
            Thread.sleep(1000);
            o2.resume();
            System.out.println("TWO restarted");
        }catch (InterruptedException e){
            System.out.println("INTERRUPTED: " + e);
        }

        try{
            System.out.println("wait for ends");
            o1.t.join();
            o2.t.join();
        }catch (InterruptedException e){
            System.out.println("Main interrupted");
        }finally {
            System.out.println("FINAL");
        }
    }
}
