package Generics.practice_03_24_22;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<Integer>(1234);
        one.showInfo();
        System.out.println("Value: " + one.getOb());

        Two<Integer,String> two = new Two<Integer, String>(4536,"Hello Markes");
        two.showType("Int: ","String: ");

        System.out.println("Int: " + two.getOb1());
        System.out.println("String: " + two.getOb2());
    }
}
