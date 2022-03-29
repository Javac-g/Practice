package Threads.Train_03_29_22;


public class Three extends Thread {

    String name;

    Three(String name){

        super();

        this.name = name;

        start();
    }

    public void run(){

        try{
            for (int i = 5 ; i > 0; i -- ){
                System.out.printf("%s: %d%n", name, i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){

            e.printStackTrace();

        }finally {
            System.out.println(name + ": stopped");
        }

    }
}
