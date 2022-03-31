package Generics.practice_03_31_22.Inner;

public class Main {
    public static void main(String...args){


        Two<String>  two = new Two<>("Hello: ",9865);
        System.out.print(two.getOb() +  " ");
        System.out.println(two.getNum());


    }
}
