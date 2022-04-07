package Lambdas.Practice_04_06_22.Links_To_GenMet.Two;

public class App {
    static <T> String runner(Tool<T> tool, T t){
        return "Value: " + tool.function(t);
    }
    public static void main(String...args){
        Tool<Integer> one = num->num* 99;
        Tool<String> two = msg->msg.toUpperCase();

        System.out.println(runner(one,23));
        System.out.println(runner(two,"Hello"));

    }
}
