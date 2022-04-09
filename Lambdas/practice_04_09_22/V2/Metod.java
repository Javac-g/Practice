package Lambdas.practice_04_09_22.V2;

public class Metod {


    static String One(String msg){

        return msg.toLowerCase();

    }

    String Two (String msg){

        return msg.toUpperCase();

    }

    static <T> String Three(T[] val,T t){
        int count = 0;

        for (int i = 0; i < val.length; i++){

            if (val[i]== t)count++;

        }
        return t + ": appears : " + count;
    }
}
