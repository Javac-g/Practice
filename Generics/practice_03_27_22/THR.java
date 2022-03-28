package Generics.practice_03_27_22;

public class THR<T extends LAD> {

    T[] arr_one;
    T[] arr_two;
    THR(T[] arr_one, T[] arr_two){

        this.arr_two = arr_two;
        this.arr_one = arr_one;
    }



    public void diff(THR<?> c){
        for (int i = 0; i < arr_one.length;i++){
            System.out.print(c.arr_one[i].y + "  ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr_two.length;i++){
            System.out.print(c.arr_two[i].x + "  ");
        }
    }
}
