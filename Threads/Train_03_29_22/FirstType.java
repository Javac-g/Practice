package Threads.Train_03_29_22;

import Exceptions.Three;

public class FirstType implements Runnable {

    String name;
    Thread t;

    FirstType(String name){
        this.name = name;
        System.out.println("Created: " + name);
        t = new Thread(this,name);
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
    public void start(){
        t.start();
    }
    public void pause() throws InterruptedException {
        t.wait();
    }
    public void resume(){
        t.notify();
    }
}
