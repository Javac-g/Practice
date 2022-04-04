package Lambdas.practice_04_04_22.Exemplar_Metod_Catch.Var2;

public class High {

    private int high_t;

    High(int high_t){
        this.high_t = high_t;
    }

    boolean same(High h2){

        return high_t == h2.high_t;

    }

    boolean less(High ht2){

        return high_t < ht2.high_t;

    }
}
