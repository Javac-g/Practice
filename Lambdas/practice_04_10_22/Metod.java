package Lambdas.practice_04_10_22;

public class Metod {

    static<T> String strOne(T[] values,T t){
        int cont = 0;
        for(int i = 0 ; i <= values.length-1;i++){
            if(values[i] == t){
                cont++;
            }
        }
        return "" + cont ;
    }

    static <T> Integer intOne(T[] values,T t){
        int cont = 0;
        for(int i = 0 ; i <= values.length-1;i++){
            if(values[i] == t){
                cont++;
            }
        }
        return  cont ;
    }

}
