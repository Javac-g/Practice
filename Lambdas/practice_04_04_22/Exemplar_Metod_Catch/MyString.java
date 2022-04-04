package Lambdas.practice_04_04_22.Exemplar_Metod_Catch;

public class MyString {
    String Reverce(String s){
        int i;
        String result = "";
        for (i = s.length()-1;i >=0;i--){

            result = result + s.charAt(i);

        }
        return result;
    }
}
