package Generics.Generic_Constructors;

public class One {
    private double val;

    <T extends Number> One(T arg){

        val = arg.doubleValue();

    }

    void show(){
        System.out.println("Value: " + val);
    }
}
