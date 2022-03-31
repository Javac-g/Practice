package Generics.practice_03_31_22;

public class Instance<T> {
    T ob;

    Instance(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
