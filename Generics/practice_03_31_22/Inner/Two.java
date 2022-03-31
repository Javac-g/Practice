package Generics.practice_03_31_22.Inner;

public class Two<T> extends One {

    T ob;

    Two(T ob, int num){
        super(num);
        this.ob=ob;
    }

    T getOb(){

        return ob;

    }

}
