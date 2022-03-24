package Generics;

public class NonGenDem {

    public static void main(String...args){

        NonGen iob = new NonGen(99);
        iob.showType();
        int v = (Integer) iob.getOb();
        System.out.println("Value: " + v);

        NonGen sob = new NonGen("Hello");
        sob.showType();
        String str = (String) sob.getOb();
        System.out.println("Value: " + str);
        iob = sob;// Type security error
        v = (Integer) iob.getOb();
        System.out.println("Value: " + v);

    }
}
