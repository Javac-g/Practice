package Lambdas.practice_04_09_22.V2;

public class App {
    static String Run(Toolz toolz){

    }
    public static void main(String...args){

        Toolz one  = msg->msg.toUpperCase();
        System.out.println(one.function("FirsT"));

        Toolz two = msg -> {
            String s = "";
            for (int i  = msg.length()-1; i >= 0 ; i --){
                s += msg.charAt(i);
            }
            return s;
        };

        System.out.println(two.function("SeconD"));



    }
}
