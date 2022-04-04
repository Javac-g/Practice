package Lambdas.practice_04_04_22.Static_Metod_Catch;

public class MyString {

    static String Reverse(String str){
        String resul = "";
        int i;
        for (i = str.length()-1;i >= 0; i--){
            resul = resul+ str.charAt(i);
        }
        return resul;
    }
}
