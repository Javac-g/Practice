package Generics.practice_03_27_22;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<>(99876);
        System.out.println(one.getOb().getClass().getName());
        One<String> two = new One<>("Hello");
        System.out.println(two.getOb().getClass().getName());

        Two<String,Integer> TWO = new Two<>("The answer is: ",42);
        System.out.println(TWO.getT()+TWO.getV());

        THR<Double> thr = new THR<>(22.3);
        System.out.println("Double: " + thr.getOb());

    }
}
