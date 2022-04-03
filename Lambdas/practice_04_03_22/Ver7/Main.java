package Lambdas.practice_04_03_22.Ver7;

public class Main {
    static <T extends Tool,V> String creator(T t, V v){
        return "Result: " + t.metod(v);
    }
    public static void main(String...args){

        Tool<Integer> one = (num)-> num * 900;
        Tool<String> two = (msg) -> msg.toUpperCase();

        System.out.println(creator(one,345));
        System.out.println(creator(two,"asdfgh"));

    }
}
