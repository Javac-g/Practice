package Lambdas.practice_04_03_22.Var1;

public class Main {
    //Lazy to create two methods(String and Integer) :D

    static <T extends Tool,V> String forall(T t, V v){
        return "Result: " + t.create(v);
    }
    public static void main(String...args){

        Tool<String> one = (msg) -> msg.toUpperCase();
        Tool<Integer> two = (numb) -> numb * numb * numb;

        System.out.println(forall(one,"hello"));
        System.out.println(forall(two,12));

    }
}
