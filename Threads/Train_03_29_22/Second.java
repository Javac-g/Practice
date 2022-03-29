package Threads.Train_03_29_22;

public class Second implements Runnable {

    String name;
    Thread t;

    Second(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Created: " + name);
        t.start();
    }
    public void run(){
        try{
            for (int i = 5;i > 0; i--){

                System.out.printf("%s: %d%n", name, i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(name + " stopped");
        }
    }

}
