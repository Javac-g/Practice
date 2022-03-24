package Generics.practice_03_24_22;

public class StatsRun {
    public static void main(String...args){

        Integer inums[] = {1,2,3,4,5,6,7};
        Stats<Integer> stats = new Stats<Integer>(inums);

        System.out.println("Average: " + stats.average());



    }
}
