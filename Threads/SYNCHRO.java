package Threads;

public class SYNCHRO {
    public static void main(String...args){
        CALL target = new CALL();
        CALLER one = new CALLER(target,"Welcome");
        CALLER two = new CALLER(target,"To synchronized");
        CALLER three = new CALLER(target,"World");
    }
}
