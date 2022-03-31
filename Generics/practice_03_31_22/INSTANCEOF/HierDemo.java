package Generics.practice_03_31_22.INSTANCEOF;

import Generics.practice_03_31_22.INSTANCEOF.One;

public class HierDemo {
    public static void main(String...args){

        One<Integer> iob = new One<>(99);
        Two<String> iob2 = new Two<>("dfdfdf");

        if(iob2 instanceof Two<?>){
            System.out.println(iob2.getOb().getClass().getName());
        }



    }
}
