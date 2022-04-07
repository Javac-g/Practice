package Lambdas.practice_04_07_22;

public class Meth {

    static String first(String msg){
        return msg.toUpperCase();
    }

    String second(String msg){
        return msg.toLowerCase();
    }

    Integer third(Integer numb){

        return numb * 5;
    }
    <T> String strfours(T[] num, T t){
        Integer count = 0;
        for (int i = 0; i <= num.length -1; i++){
            if(num[i] == t)count++;
        }
        return"" + count;
    }
    <T> Integer intfours(T[] num,T t){
        Integer count = 0;
        for (int i = 0; i <= num.length -1; i++){
            if(num[i] == t)count++;
        }
        return count;
    }
}
