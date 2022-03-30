package Generics.Generic_Constructors.practice;

public class App {
    public static void main(String...args){

        Stack<Integer> myint = new Stack<>(15);
        Stack<String> mystr = new Stack<>(4);

        String[] words = {" hello " ," My ","String","Array"};

        for (int i = 0; i < 15 ;i++) myint.push(i);
        for(int j = 0; j < 4 ; j++) mystr.push(words[j]);

        System.out.println("Integer: ");

        for (int i = 0; i < 15; i++) {

            System.out.print(myint.pop() + " ");

        }

        System.out.println("\nString: ");

        for (int i = 0; i < 4; i++) {

            System.out.print(mystr.pop() + " ");

        }
    }
}
