package Lambdas.practice_04_03_22.Var2;



public class Main {

    static <T extends Tool,V> String create(T t, V v){
        return "Resulting: " + t.func(v);
    }


    public static void main(String...args){

       Tool<Integer> one = (numb)-> numb * numb - (numb/2);

        Tool<String> two = (msg) -> msg.toUpperCase();

        System.out.println(create(one,95));
        System.out.println(create(two,"my string To UpPeR CaSe"));




    }
}
