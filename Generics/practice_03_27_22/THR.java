package Generics.practice_03_27_22;

public class THR<T extends Number> {
    T ob;
    THR(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
