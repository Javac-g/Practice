package Generics.practice_03_29_22;

public class OneDem {
    public static void main(String...args){

        One<Integer> one = new One<Integer>(2321);
        one.show();
        System.out.println("Val: " + one.getObject());

        One<String> two = new One<String>("Hello");
        two.show();
        System.out.println("Val: " + two.getObject());

    }
}
