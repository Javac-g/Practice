package Lambdas.Practice_06_04_22.LinksToCOns.Ver2;

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
