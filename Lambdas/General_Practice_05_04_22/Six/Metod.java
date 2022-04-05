package Lambdas.General_Practice_05_04_22.Six;

public class Metod {

    static String revers(String s){
        String res = "";

        for (int i = s.length()-1;i >=0;i--){

            res+=s.charAt(i);
        }
        return res;
    }
    static Integer Mynumber(Integer num){
        return (num * 888) / 123;
    }
    Integer Numd(Integer d){
        return (d * 123) / 143;
    }
}
