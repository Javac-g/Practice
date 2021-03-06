package Lambdas.practice_04_09_22.V2;

public class App {

    static String Run(Toolz toolz,String msg){

        return "" + toolz.function(msg);

    }

    static <T> String Runner(Setup<T> setup, T t){

        return "" + setup.function(t);
    }

    static <V> String create (Best<V> best, V[] vals,V v ){

        return best.function(vals,v);
    }

    public static void main(String...args){
        //#1
        Toolz one  = msg->msg.toUpperCase();
        Math math = num -> num + 400;
        System.out.println(one.function("FirsT"));
        System.out.println(math.function(12415));
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

        System.out.println(Runner(Nsetup,10000));
        System.out.println(Runner(Ssetup,"Hello Markes"));

        Metod object = new Metod();
        System.out.println(Runner(Metod::One,"LINK"));
        System.out.println(Runner(object::Two,"Next ONE"));

        Integer[] arr = {1,1,2,3,4,1,2,1,2,1,4,5,6};
        String[] sarr = {"one","two","three","four","two","two","two"};


        System.out.println(create(Metod::Three,arr,1));
        System.out.println(create(Metod::Three,sarr,"two"));





    }
}
