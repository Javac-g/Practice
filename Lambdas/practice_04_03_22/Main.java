package Lambdas.practice_04_03_22;

public class Main {
    static String create(Func one,String msg){
       return one.qwerty(msg);
    }
    public static void main(String...args){
        Func one =(str) ->str.toUpperCase();
        String output = create(one,"Hello world");
        System.out.println(output);




    }
}
