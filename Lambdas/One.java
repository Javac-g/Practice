package Lambdas;

public class One {
    public static void main(String...args){
        Tool_One toolOne;
        Tool_Two tool_two;
        Tool_Three tool_three;
        Tool_Four tool_four = (n) ->{
            int result = 1;
            for( int  i = 1; i <= n ;i++){
                result = result * i;
            }
            return result;
        };

        Tool_Five tool_five =(w) ->{
            String result = "";
            for(int i = w.length() - 1; i >= 0; i --){
                result += w.charAt(i);
            }
            return  result;
        };

        toolOne = () -> 123.45;
        System.out.println(toolOne.getValue());
        toolOne = () -> Math.random() * 100;
        System.out.println(toolOne.getValue());
        tool_two = n -> n * n > 5;
        System.out.println(tool_two.test(5));
        tool_three  = (n,v) -> (n%v) == 0;
        System.out.println(tool_three.test(294,5));
        System.out.println(tool_four.func(5));
        System.out.println("Revers = " + tool_five.revers("Revers"));
    }
}
