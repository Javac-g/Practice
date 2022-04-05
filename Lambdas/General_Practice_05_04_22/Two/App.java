package Lambdas.General_Practice_05_04_22.Two;

public class App {
    public static void main(String...args){
        Integer num = 100222;
        String str = "Halo";
        One<Integer> cover = new One<>(num);
        One<String> over = new One<>(str);

        System.out.println(cover.getOb().getClass().getName());
        System.out.println(over.getOb().toUpperCase());
    }
}
