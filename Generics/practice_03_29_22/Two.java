package Generics.practice_03_29_22;

public class Two<T extends Number,V extends String> {
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

    public void show(){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("V: " + v.getClass().getName());
    }
}
