package Generics.Generic_Interfaces;

public class App {
    public static void main(String...args){
        Integer[] inums = {3,6,2,8,6};
        Character[] characters = {'b','r','p','w','a'};

        Main<Integer> iobj = new Main<>(inums);
        Main<Character> chobj = new Main<>(characters);

        System.out.println("Max value Integer: " + iobj.max());
        System.out.println("Min value Integer: " + iobj.min());

        System.out.println("Max value Character: " + chobj.max());
        System.out.println("Min value Character: " + chobj.min());
    }
}
