package Lambdas.General_Practice_05_04_22.Five;


public class Main {
    static String runner_one(Tools tools,String msg){
        return tools.message(msg);
    }

    static <T> String runner_two(GTool<T> gTool,T t){
        return "Value: " + gTool.function(t);
    }
    public static void main(String...args){

        Tools tools = (msg) -> msg.toUpperCase();
        System.out.println(runner_two(On::HTMS,"DKKDKDKD"));
        System.out.println(tools.message("string in upper case"));
        System.out.println(runner_one(On::HTMS,"LOWER CASE"));

    }
}
