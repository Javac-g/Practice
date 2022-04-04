package Lambdas.practice_04_04_22.Static_Metod_Catch;

public class Main {
    static String  processData(Tool tool,String m){
         return tool.Func(m);
    }
    static String newpro(Tool_two tool , String s){
        return tool.up(s);
    }

    public static void main(String...args){
        String inp = " hello i am reversed string example";
        String out;
        String out2;

        out = processData(MyString::Reverse,inp);
        out2 = newpro(MyUp::myUpper,inp);
        System.out.println("Before: " + inp);
        System.out.println("After: " + out);
        System.out.println("Before: " + inp);
        System.out.println("After: " + out2);
    }

}
