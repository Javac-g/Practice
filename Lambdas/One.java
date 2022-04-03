package Lambdas;

public class One {
    public static void main(String...args){
        //links

        Tool_One one;
        Tool_Two two;
        Tool_Three three;



        //blocks


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





        one = () -> Math.random() * 100;
        two = n -> n * n > 5;
        three  = (n,v) -> (n%v) == 0;
        Tool_Six<Integer> six = (value) ->  value;
        Tool_Six<String> six1 = (value) -> value ;

        System.out.println(one.getValue());
        System.out.println(two.test(5));
        System.out.println(three.test(294,5));
        System.out.println(tool_four.func(5));
        System.out.println("Revers = " + tool_five.revers("Revers"));
        System.out.println("Value: " + six1.myname("String"));
        System.out.println("Value: " + six.myname(23542));
    }
}
