package Lambdas.Practice_04_06_22.LinksToCOns.Ver2;

public class One<T> {
    private T val;
    One(T val){
        this.val = val;
    }

    One(){
        val = null;
    }
    T getVal(){
        return val;
    }
}
