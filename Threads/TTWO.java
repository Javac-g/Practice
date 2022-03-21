package Threads;

public class TTWO extends  Thread {
    String name;

    TTWO(String name){
        super();
        this.name = name;
        System.out.println(name + " Created: " + this);
        start();

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
