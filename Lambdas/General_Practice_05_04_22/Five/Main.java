package Lambdas.General_Practice_05_04_22.Five;


public class Main<T> {
    static String runner_one(Tools tools,String msg){
        return tools.message(msg);
    }

    T runner_two(Tools tools,T t){
        return
    }
    public static void main(String...args){

        Tools tools = (msg) -> msg.toUpperCase();
        System.out.println(tools.message("string in upper case"));
        System.out.println(runner_one(On::HTMS,"LOWER CASE"));

    }
}
