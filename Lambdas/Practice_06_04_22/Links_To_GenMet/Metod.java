package Lambdas.Practice_06_04_22.Links_To_GenMet;

public class Metod{

    static <T> int bufff(T[] vals,T t){

        int count  = 0;
        for(int i = 0 ; i <vals.length; i++){
            if(vals[i] == t)count++;
        }
        return count;
    }

}
