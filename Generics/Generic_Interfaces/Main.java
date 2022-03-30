package Generics.Generic_Interfaces;

public class Main<T extends Comparable<T>> implements MinMax<T> {

    T[] values;

    Main(T[] values){

        this.values = values;

    }

    public T min(){
        T v = values[0];
        for (int i = 1; i < values.length;i++){
            if(values[i].compareTo(v) < 0){
                v = values[i];
            }

        }
        return v;
    }
    public T max(){
        T v = values[0];
        for(int i = 1; i <values.length;i++){
            if(values[i].compareTo(v) > 0){
                v = values[i];
            }
        }
        return v;
    }

}
