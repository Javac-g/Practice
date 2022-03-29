package Threads.Train_03_29_22;

public class Caller implements Runnable {
    String msg;
    call ob;
    Thread t;

    Caller(call ob, String msg){
        this.ob = ob;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    public void run(){

        synchronized (ob){
            ob.calling(msg);
        }

    }

}
