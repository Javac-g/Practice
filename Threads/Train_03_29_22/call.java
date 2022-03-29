package Threads.Train_03_29_22;

public class call {
    void calling(String msg){
        try {
            System.out.print("[" + msg);
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("]");
        }
    }
}
