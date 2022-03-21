package hw.one;

import java.io.IOException;

public class DataIN implements Runnable {

    Service service;
    public double[] arr = {30.0, 15.0,22.0,1234.0};

    DataIN(Service service){

        this.service = service;

        Thread t = new Thread(this);

        t.start();
    }
    public void run(){
        try{
            for(int i = 0; i < 4; i++){
                service.recorder("Number [" + i +"]","C:\\Users\\Max.000\\IdeaProjects\\Oracle\\enum\\src\\hw\\one\\hello.txt");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }finally {
            try {
                service.reader("hello.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
