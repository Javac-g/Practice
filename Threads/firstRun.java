package Threads;

public class firstRun {
    public static void main(String...args){

        TOne myImplemented = new TOne("One");
        TTWO myExtended = new TTWO("Two");
        try{
            for (int i = 5; i > 0 ; i--){
                System.out.println("Main: " + i);
                Thread.sleep(1000);
            }
            System.out.println("Main: END.");


        }catch (InterruptedException e){
            System.out.println("Interrupted Main");
        }

    }
}
