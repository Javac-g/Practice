package Threads.One;

public class Producer implements Runnable {

    Product product;


    Producer(Product product){

        this.product = product;

        new Thread(this, "Поставщик").start();

    }

    public void run(){

        try{

            int i = 0;

            while (i++ < 100){

                product.put(i);

                Thread.sleep(1000);

            }

        }catch (InterruptedException e){

            System.out.println("Interrupted");

        }
    }
}
