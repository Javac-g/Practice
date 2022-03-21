package Threads.Three;

public class One implements Runnable {

    String name;
    Thread t;
    boolean flag;

    One(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println(" NEW THREAD " + t);
        flag = false;
        t.start();

    }
    public void run(){
        try{
            for(int i = 15; i > 0; i--){

                System.out.println(name + ": " + i);
                Thread.sleep(500);
                synchronized(this){
                    while (flag){
                        wait();
                    }

                }
            }

        }catch (InterruptedException e){
            System.out.println(name + " Interrupted");
        }finally {
            System.out.println(name + " END");
        }


    }
    synchronized void suspend(){
        flag = true;
    }
    synchronized void resume(){
        flag = false;
        notify();
    }


}
