package Lambdas.practice_04_10_22;

public class App {

    static <T> String SR(StrInf<T> tool,T[] vals,T t){

        return "Values as String: " + tool.function(vals,t);

    }

    static <T> Integer IR(IntInf<T> tool,T[] vals, T t){

        return tool.function(vals,t);

    }

    static <T,V> T AR(allIntf<T,V> tool,V[] val,V v){

        return tool.function(val,v);

    }

    public static void main(String...args){
        String[] str = {"one","two","one","one","two","one"};
        Integer[] num = {1,1,1,1,12,2,2,3,4,2,2,1,1,2,3,4,5,6,7,8,9};


        System.out.println(SR(Metod::strOne,str,"one"));
        System.out.println(SR(Metod::strOne,num,1));

        System.out.println("Values as Integer: " + IR(Metod::intOne,str,"one"));
        System.out.println("Values as Integer: " + IR(Metod::intOne,num,1));

        System.out.println("Values as Generic Metod:" + AR(Metod::intOne,num,1));
        System.out.println("Values as Generic Metod:" + AR(Metod::strOne,num,1));
        System.out.println("Values as Generic Metod:" + AR(Metod::intOne,str,"one"));
        System.out.println("Values as Generic Metod:" + AR(Metod::strOne,str,"one"));


    }
}
