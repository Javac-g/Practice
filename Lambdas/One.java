package Lambdas;

public class One {
    public static void main(String...args){
        Tool_One toolOne;
        Tool_Two tool_two;
        Tool_Three tool_three;
        toolOne = () -> 123.45;
        System.out.println(toolOne.getValue());
        toolOne = () -> Math.random() * 100;
        System.out.println(toolOne.getValue());
        tool_two = n -> n * n > 5;
        System.out.println(tool_two.test(5));
        tool_three  = (n,v) -> (n%v) == 0;
        System.out.println(tool_three.test(294,5));
    }
}
