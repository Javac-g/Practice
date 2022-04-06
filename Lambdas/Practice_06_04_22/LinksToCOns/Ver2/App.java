package Lambdas.Practice_06_04_22.LinksToCOns.Ver2;

public class App {
    public static void main(String...args){
        Tool<Integer> myclassone = One<Integer>::new;
        One<Integer> mc = myclassone.function(123);
    }
}
