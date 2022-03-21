package Threads;

public class TOne implements Runnable {

    Thread t;
    String name;

    TOne(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println(name + " Created: " + this);
        t.start();
    }
    public void run(){
        try {
            for(int i = 5;i > 0; i--){
                System.out.println(name + ": " + i );
                Thread.sleep(500);
            }
            System.out.println(name + ": END.");
        }catch (InterruptedException e){
            System.out.println("Interrapted: " + name);
        }
    }
}
