package Generics.practice_03_31_22.Generic_Super;

public class Main {
    public static void main(String...args){

        Two<String,Integer> x = new Two<>("Value: ",99);

        System.out.print((x.getOb()));
        System.out.println(x.getOb2());
    }
}
