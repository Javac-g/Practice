package Lambdas.practice_04_09_22.V2;

public class App {

    static String Run(Toolz toolz,String msg){

        return "" + toolz.function(msg);

    }

    public static void main(String...args){
        //#1
        Toolz one  = msg->msg.toUpperCase();

        System.out.println(one.function("FirsT"));
        //#2
        Toolz two = msg -> {
            String s = "";
            for (int i  = msg.length()-1; i >= 0 ; i --){
                s += msg.charAt(i);
            }
            return s;
        };

        System.out.println(two.function("SeconD"));
        //#3
        System.out.println(Run(two,"Howard Phillips Lovecraft"));
        //#4
        Setup<Integer> Nsetup = num -> num * 90;
        Setup<String>  Ssetup = msg -> msg.replace('a',' ');

        System.out.println(Nsetup.function(123));
        System.out.println(Ssetup.function("Hello my name is Maks"));





    }
}
