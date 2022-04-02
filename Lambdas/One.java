package Lambdas;

public class One {
    public static void main(String...args){
        Tool_One toolOne;
        toolOne = () -> 123.45;
        System.out.println(toolOne.getValue());
        toolOne = () -> Math.random() * 100;
        System.out.println(toolOne.getValue());
    }
}
