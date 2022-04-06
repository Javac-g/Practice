package Lambdas.Practice_06_04_22.LinksToCOns.Ver3;

import Lambdas.practice_04_04_22.Variable_Capch.MyFunc;

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
