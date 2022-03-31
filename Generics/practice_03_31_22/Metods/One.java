package Generics.practice_03_31_22.Metods;

public class One {

    <T> void call(T message){

        System.out.println("Received message: " + message);

    }
}
