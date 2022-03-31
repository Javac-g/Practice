package Generics.practice_03_31_22.Generic_Super;

public class Two<T,V> extends One<T> {

    V ob2;
    Two(T ob1,V ob2){

        super(ob1);

        this.ob2 = ob2;

    }
}
