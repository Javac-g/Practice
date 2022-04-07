package Lambdas.Practice_04_06_22;

public class App {

    static String runner(Tool tool,String msg){ // can have only string args
        return tool.function(msg);
    }
    static<T> String run(Tool_G<T> toolg, T t){// can have different args

        return "Value"+ toolg.Function(t);
    }
    static<T> int runrun(IntTool<T> tg, T tt){// can have different args

        return tg.function(tt);
    }

    public static void main(String...args){
        //Data
        String str = "Helo My NaMe Is MaKs";
        Integer number = 404;

        //One liner
        Tool one = msg -> msg.toLowerCase();

        //Block
        Tool two = msg ->{
            String  res = "";
            for(int i = msg.length()-1; i >= 0 ; i--){
                res+= msg.charAt(i);
            }
            return res;
        };

        //Generic lambdas one liners
        Tool_G<String> G_one = msg -> msg.toUpperCase();
        Tool_G<Integer> G_two = num -> num * 256;

        //Generic lambdas block
        Tool_G<Integer> G_three = num -> {
            int result = 2;

            for(int i = 1 ; i < 5;i++){
                result*= num ;
            }
            return result/1000;
        };

        //Lambdas like args






        //Out
        System.out.println(runner((msg)->msg.toUpperCase(),str));//Lambdas like args oneline
        System.out.println(runner(msg ->{
            String  res = "";
            for(int i = msg.length()-1; i >= 0 ; i--){
                res+= msg.charAt(i);
            }
            return res;
        },str));//Lambdas like args block
        //same two ^^^
        System.out.println(runner(one,str));
        System.out.println(runner(two,str));
        //
        System.out.println(run(G_one,str)); //Using generic interface and generic method
        System.out.println(run(G_three,number));//too
        //
        System.out.println(G_three.Function(77));//Generic block lambda
        System.out.println(G_two.Function(number));//Generic string oneline lambda
        System.out.println(G_one.Function(str));//Generic integer oneline lambda
        System.out.println(one.function(str)); // String oneline lambda
        System.out.println(two.function(str));// String block lambda
        // links to static metod
        System.out.println(run(Metod::Buff,"Hello"));
        //links to exemplars metod
        Metod metod = new Metod();
        System.out.println( run(metod::Duff,"hello again"));

    }
}
