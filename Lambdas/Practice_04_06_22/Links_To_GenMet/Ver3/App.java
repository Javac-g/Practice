package Lambdas.Practice_04_06_22.Links_To_GenMet.Ver3;

public class App {
    static<T> T runner(ToolX<T> tool,T t){
        return tool.function(t);
    }
    public static void main(String...args){

        System.out.println(runner(MyMet::buff,123));
        System.out.println(runner(MyMet::buff,"hello"));


    }
}
