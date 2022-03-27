package Generics.practice_03_27_22;

public class Two<T,V> {
    T t ;
    V v;

    Two(T t, V v){
        this.t = t;
        this.v = v;

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
