package Lambdas.Practice_06_04_22;

public class App {
    public static void main(String...args){
        //One liner
        Tool one = msg -> msg.toLowerCase();

        //Block
        Tool two = msg ->{
            String  res = "";
            for(int i = msg.length(); i >= 0 ; i--){
                res+= msg.charAt(i);
            }
            return res;
        };

        //Generic lambdas



        System.out.println(one.function("HAHAHAHAHAHHAHAHA"));

    }
}
