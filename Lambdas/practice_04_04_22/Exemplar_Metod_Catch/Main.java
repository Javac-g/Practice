package Lambdas.practice_04_04_22.Exemplar_Metod_Catch;

public class Main {
    static String runner(Tool tool,String s){

        return tool.Markes(s);

    }
    public static void main(String...args){
        String input = "hello string to be processed";
        String output;

        MyString myString = new MyString();

        output = runner(myString::Reverce,input);

        System.out.println("Before: " + input);
        System.out.println("After: " + output);

    }
}
