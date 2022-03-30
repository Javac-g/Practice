package Generics.Generic_Metods;

public class One {

    static <T extends Comparable <T>, V extends T> boolean isin(T x, V[] y){
        for (int i = 0; i < y.length; i++){

            if(x.equals(y[i])){

                return true;

            }
        }
        return false;
    }
}
