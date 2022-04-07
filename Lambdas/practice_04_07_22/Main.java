package Lambdas.practice_04_07_22;

public class Main {
    static <T>  T runner (ALLtool<T> tool, T t){
        return tool.function(t);
    }

    static <T> String runSTR(Xtool<T> tooool, T[] vals, T t){

        return "" + tooool.functio(vals,t);

    }
    static <T> Integer runINT(StrTool<T> tooool, T[] vals, T t){
        return tooool.functio(vals,t);
    }
    public static void main(String...args){
        Meth meth = new Meth();
        Integer[] nums = {1,2,3,4,3,2,1,2,32,3,43,2,};
        String[] str = {"one","two","three","four","two","two","two"};

        ALLtool<Integer> ToolOne = num->num /100;
        ALLtool<String> ToolTwo = msg->   msg;

        System.out.println(ToolOne.function(999));
        System.out.println(ToolTwo.function("zero"));

        System.out.println("Value: " + runner(Meth::<String>first,"firsT"));
        System.out.println("Value: " + runner(meth::<String>second,"SECONd"));
        System.out.println("Value: " + runner(meth::<Integer>third,1234));

        System.out.println("Value: " + runINT(meth::intfours,nums,1));
        System.out.println("Value: " + runINT(meth::intfours,str,"two"));

        System.out.println("Value: " + runSTR(meth::strfours,nums,1));
        System.out.println("Value: " + runSTR(meth::strfours,str,"two"));




    }
}
