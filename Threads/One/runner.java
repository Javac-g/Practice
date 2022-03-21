package Threads.One;

public class runner {
    public static void  main(String...args){
        Product product = new Product();

        new Producer(product);
        new Consumer(product);


    }
}
