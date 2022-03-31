package Generics.practice_03_31_22.Interface;

public class Main<T extends Comparable<T>> implements MyTools<T> {

    T[] arr;

    Main(T[] arr){

        this.arr = arr;
    }

    @Override
    public T min() {
        T min = arr[0];
        for (int i = 1; i <arr.length;i++){
            if(arr[i].compareTo(min) < 0){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = arr[0];
        for (int i = 1; i <arr.length;i++){
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
}
