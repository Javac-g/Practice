package Generics.practice_03_24_22;

public class One<T> {

    T ob;

    One(T ob){

        this.ob = ob;

    }

    T getOb(){
        return ob;
    }

    void showInfo(){

        System.out.println("Type: " + ob.getClass().getName());


    }
}
