package Generics;

public class NonGenDem {

    public static void main(String...args){

        NonGen iob;
        iob = new NonGen(99);
        iob.showType();
        int v = (Integer) iob.getOb();
        System.out.println("Value: " + v);

    }
}
