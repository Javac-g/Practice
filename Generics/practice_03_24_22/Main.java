package Generics.practice_03_24_22;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<Integer>(1234);
        one.showInfo();
        System.out.println("Value: " + one.getOb());

    }
}
