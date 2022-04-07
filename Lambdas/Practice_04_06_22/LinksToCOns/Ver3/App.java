package Lambdas.Practice_04_06_22.LinksToCOns.Ver3;

public class App {
    static <R,T> R myClassFactory(Tool<R,T> tool, T t){
        return tool.function(t);
    }
    public static void main(String...args){

        Tool<MyClass<Double>,Double> myclass = MyClass<Double>::new;
        MyClass<Double> mc  = myClassFactory(myclass,100.1);
        System.out.println(mc.getVal());
    }
}
