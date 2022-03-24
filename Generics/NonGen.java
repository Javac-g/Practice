package Generics;

public class NonGen {
    Object ob;

    NonGen(Object ob){

        this.ob = ob;

    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type: " + ob.getClass().getName());
    }
}
