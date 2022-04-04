package Lambdas.practice_04_04_22.Static_Metod_Catch;

public class Main {
    static String  processData(Tool tool,String m){
         return tool.Func(m);
    }

    public static void main(String...args){
        String inp = " hello i am reversed string example";
        String out;

        out = processData(MyString::Reverse,inp);
        System.out.println("Before: " + inp);
        System.out.println("After: " + out);
    }

}
