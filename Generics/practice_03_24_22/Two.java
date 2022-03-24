package Generics.practice_03_24_22;

public class Two<T,V> {
    T ob1;
    V ob2;

    Two(T ob1,V ob2){

        this.ob1 = ob1;
        this.ob2 = ob2;

    }

    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }

    void showType(String one,String two){

        System.out.println(one + ob1.getClass().getName());
        System.out.println(two + ob2.getClass().getName());

    }









}
