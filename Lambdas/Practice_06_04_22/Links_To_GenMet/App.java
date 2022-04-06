package Lambdas.Practice_06_04_22.Links_To_GenMet;

public class App {
    static <T> int process(inTool<T> tool, T[] valls,T t){
        return tool.function(valls,t) ;
    }
    public static void main(String...args){
        Integer[] vals = {1,2,3,4,5,6,7,5,4,3,2,34,3,5,6,5,4,3};
        String[] str = {"One","Two" , "Three","Four","Five","Six","Seven"};
        int count;


        System.out.println(process(Metod::<Integer>bufff,vals,3));
        System.out.println(process(Metod::<String>bufff,str,"Two"));
    }
}
