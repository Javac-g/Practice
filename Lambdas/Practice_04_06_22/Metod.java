package Lambdas.Practice_04_06_22;

public class Metod {
    static String Buff(String msg){
        return "Static metod reached: " + msg ;
    }

    String Duff(String msg){
        return "Exemplar metod reached:  " + msg;
    }

    static <T> String setters(T  t){

        return "Value: " + t;

    }

}
