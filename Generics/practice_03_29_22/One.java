package Generics.practice_03_29_22;

public class One<T> {
    T object;

    One(T object){

        this.object = object;

    }

    public T getObject() {
        return object;
    }

    public void show() {

        System.out.println(object.getClass().getName());

    }
}
