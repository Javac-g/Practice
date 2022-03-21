package Threads.One;

public class Consumer implements Runnable{

    Product product;


    Consumer(Product product){

        this.product = product;

        new Thread(this,"Потребитель").start();

    }


    public void run() {

        try{
            int j = 0;

            while(j++ < 100){

                product.get();
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
