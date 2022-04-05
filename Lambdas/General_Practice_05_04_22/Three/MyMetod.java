package Lambdas.General_Practice_05_04_22.Three;

public class MyMetod {

    static String Message( String msg){

        return "Damn you so cool: " + msg;

    }

    static Integer Add(Integer num){
        return num * num + 1;
    }
    static <T>String all(T t){

        return "Value: " + String.valueOf(t);
    }

}
