package Lambdas.practice_04_04_22;

public class Main {


    static <T extends Tool,V>String funct(T t, V v){
        return "Value: " + t.runner(v);
    };
    public static void main(String...args){
        Tool<Integer> one = (numb)-> numb /2;
        Tool<String> two = (msg) -> msg.toUpperCase();
        Fish curs = (msg)->msg.toUpperCase();
        System.out.println(funct(one,1234));
        System.out.println(funct(two,"Hello"));
        System.out.println(two.runner("runner"));
        System.out.println(curs.message("hello"));


    }
}
