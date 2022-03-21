package Threads;

public class secondRun {
    public static void main(String...args){
        TOne one = new TOne("one");
        TTWO two = new TTWO("two");


        System.out.println(one.name + " alive: " + one.t.isAlive());
        System.out.println(two.name + "alive " + one.t.isAlive());

        try {
            System.out.println("WAITING FOR THREADS PROCESSES");
            one.t.join();
            two.join();
        }catch (InterruptedException e){
            System.out.println("Interrapted");
        }

        System.out.println(one.name + " alive: " + one.t.isAlive());
        System.out.println(two.name + " alive: " + one.t.isAlive());
    }
}
