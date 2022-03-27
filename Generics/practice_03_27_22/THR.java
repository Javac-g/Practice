package Generics.practice_03_27_22;

public class THR<T extends Number> {

    T[] arr_one;
    THR(T[] arr_one){

        this.arr_one  = arr_one;
    }



    public void diff(THR<?> arr_two){

    }
}
