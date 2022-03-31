package Generics.practice_03_31_22.Method_GEn_Override;

public class Two<T> extends One<T> {
    Two(T ob){

        super(ob);

    }
    @Override
    T getOb(){
        System.out.println("TWO");
        return ob;
    }
}
