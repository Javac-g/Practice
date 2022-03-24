package Generics.practice_03_24_22;

public class StatsRun {
    public static void main(String...args){

        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        System.out.println("Integer Average: " + iob.average());

        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        System.out.println("Double Average: " + dob.average());

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        System.out.println("Float Average: " + fob.average());

        if(iob.sameAVG(dob)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
