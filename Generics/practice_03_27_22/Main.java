package Generics.practice_03_27_22;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<>(99876);
        System.out.println(one.getOb().getClass().getName());
        One<String> two = new One<>("Hello");
        System.out.println(two.getOb().getClass().getName());

        Two<String,Integer> TWO = new Two<>("The answer is: ",42);
        System.out.println(TWO.getT()+TWO.getV());
        Double[] arr1 = {222.3,421.4,92.11};
        Integer[] arr2 = {1,2,3,4,5,6,3,2};
        THR<Double> thd = new THR<>(arr1);
        THR<Integer> thi = new THR<>(arr2);
        thd.diff(thi);



    }
}
