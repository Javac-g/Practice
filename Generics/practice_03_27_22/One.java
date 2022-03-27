package Generics.practice_03_27_22;

public class One<T> {
    T ob;

    One(T ob){

        this.ob = ob;

    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
