package Threads;

public class CALL {
    synchronized void calling(String msg){

        try{
            System.out.print("["+msg);
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println("Interrupted: " + e);
        }
        System.out.println("]");

    }
}
