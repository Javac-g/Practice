package Lambdas.General_Practice_05_04_22.Six;

import Lambdas.practice_04_03_22.Ver.Tool;

public class Main {

    static String runner(Stool<String> stool,String msg){
        return stool.function(msg);
    }
    static <T> String run(Stool<T> ftool, T msg){
        return ""+ ftool.function(msg);
    }
    public static void main(String...args){

        Stool<String> one = msg->msg.toLowerCase();
        System.out.println(run(Metod::Mynumber,124));
        System.out.println(run(Metod::revers,"124"));
        System.out.println(one.function("asdfggfds"));
        System.out.println(runner(Metod::revers,"Hello world"));

    }
}
