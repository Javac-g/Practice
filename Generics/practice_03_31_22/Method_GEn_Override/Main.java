package Generics.practice_03_31_22.Method_GEn_Override;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<>(2323);
        System.out.println(one.getOb());

        Two<Integer> two = new Two<>(999999);
        System.out.println(two.getOb());

    }
}
