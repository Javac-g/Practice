package Lambdas.General_Practice_05_04_22.Five;

public class Main {
    public static void main(String...args){

        Tools tools = (msg) -> msg.toUpperCase();
        System.out.println(tools.message("string in upper case"));


    }
}
