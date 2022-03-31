package Generics.practice_03_31_22.Method_GEn_Override;

public class One<T> {
    T ob;

    One(T ob){
        this.ob = ob;

    }

     T getOb() {
        System.out.println("ONE:");
        return ob;
    }
}
