package Lambdas.practice_04_03_22.Ver;

public class Main {
    static <T extends Tool,V> String create(T t, V v){

        return" Result: " + t.func(v) ;

    }
    public static void main(String...args){

       Tool<Integer> one = (num) -> (num * 11) / 3;
       Tool<String> two = (msg) -> msg.toUpperCase();

        System.out.println(create(one,331));
        System.out.println(create(two,"a b c d f g"));

    }
}
