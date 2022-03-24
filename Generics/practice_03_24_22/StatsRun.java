package Generics.practice_03_24_22;

public class StatsRun {
    public static void main(String...args){

        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> stats = new Stats<Integer>(inums);

        System.out.println("Average: " + stats.average());
        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        System.out.println("Average: " + stats.average());


    }
}
