package Lambdas.practice_04_09_22.V3;

public class App {
    static <T,V> String FRun(TOOL<T,V> tool,T[] vals,T t){

        return "" + tool.function(vals,t);

    }
    static <T>Integer inRun(InTool<T> tool,T[] vals, T t){
        return tool.func(vals,t);
    }

    static <T>String stRun(StTool<T> tool,T[] vals, T t){
        return tool.func(vals,t);
    }



    public static void main(String...args){
        Integer[] arrI = {1,2,1,1,1,1,2,2,3,4,5,6,7};
        String[] arrS = {"one","two","three","four","two","two","two"};

        System.out.println(FRun(METOD::one,arrI,1));
        System.out.println(FRun(METOD::one,arrS,"two"));

        System.out.println(inRun(METOD::one,arrI,1));
        System.out.println(inRun(METOD::one,arrS,"two"));

        System.out.println(stRun(METOD::two,arrI,1));
        System.out.println(stRun(METOD::two,arrS,"two"));


    }
}
