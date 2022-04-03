package Lambdas;

public class LambdasArgument {

    static String word(Tool_Seven seven,String message){

       return seven.funct(message);

    }

    public static void main(String...args){
        Tool_Seven seven = (message) -> message.toUpperCase();

        Tool_Seven revers = (message) ->{
            String res = "";
          for(int i = message.length()-1;i >= 0; i --){
              res = res+message.charAt(i);
          }
          return res;
        };

        String input = "hello its string in upper case";
        String output = word(seven,input) ;
        System.out.println(word(revers,input));

        System.out.println(output);



    }
}
