package Generics.practice_03_31_22.Interface;

public class App {
    public static void main(String...args){

        Integer[] inums = {3,6,2,8,6};

        Main<Integer> ini = new Main<>(inums);
        System.out.println("Min: " + ini.min());
        System.out.println("Max: " + ini.max());


    }
}
