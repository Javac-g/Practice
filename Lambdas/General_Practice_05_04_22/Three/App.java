package Lambdas.General_Practice_05_04_22.Three;

public class App {

    static<T> String runner(Tool<T> tool, T t){
        return "Value: " + tool.function(t);
    }
    public static void main(String...args){
        Tool<Integer> one = (num)-> (num + num * num);
        Tool<String> two = (str) -> str.toUpperCase();

        System.out.println(one.function(12345));
        System.out.println(two.function("my name is StriNg"));
        //To generic method
        System.out.println(runner(one,1234));
        System.out.println(runner(two,"asdfghjk"));
        //Lambdas as argument

        String inp = "lalalalalalala";
        System.out.println(runner(MyMetod::Message,inp));
        System.out.println(runner(MyMetod::Add,1234));
        System.out.println(runner(MyMetod::all,"sdsdsdsd"));


    }
}
