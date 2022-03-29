package Threads.Train_03_29_22;

public class Synchro {
    public static void main(String...args){

        call c = new call();

        Caller one = new Caller(c,"Welcome");
        Caller two = new Caller(c,"to Synchronized");
        Caller three = new Caller(c,"world");

    }
}
