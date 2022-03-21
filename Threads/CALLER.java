package Threads;

public class CALLER implements Runnable {
    CALL target;
    Thread t;
    String msg;
    CALLER(CALL target, String msg){
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        synchronized(target){target.calling(msg);}
    }
}
