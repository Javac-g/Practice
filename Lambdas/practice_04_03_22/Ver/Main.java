package Lambdas.practice_04_03_22.Ver;

public class Main {
    public static void main(String...args){

       Tool<Integer> one = (num) -> num /3;
       Tool<String> two = (msg) -> msg.toUpperCase();

        System.out.println(one.func(101));
        System.out.println(two.func("a b c"));

    }
}
