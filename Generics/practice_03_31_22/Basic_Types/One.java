package Generics.practice_03_31_22.Basic_Types;

public class One<T> {

    T object;

    One(T object){
        this.object = object;
    }

    T getObject() {
        return object;
    }
}
