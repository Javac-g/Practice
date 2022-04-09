package Lambdas.practice_04_09_22.V3;

public class METOD {

    static <T> Integer one(T[] vals, T t){
        int count = 0;

        for(int i = 0; i <= vals.length-1; i++){

            if(vals[i] == t)count++;

        }
        return  count;

    }

    static <T> String two(T[] vals, T t){
        int count = 0;

        for(int i = 0; i <= vals.length-1; i++){

            if(vals[i] == t)count++;

        }
        return "" + count;

    }
}
