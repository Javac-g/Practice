package Exceptions;

import java.util.Random;

public class one {
    private static int Numb;



    public static void main(String...args){


        try {
            Random rand = new Random();
            two t = new two();

            int count = 0;
            while(++count < 100){
                Numb = rand.nextInt(100);
                System.out.println(count + ": " + Numb);
                t.hello(Numb);


            }
            t.fin();
        }catch (NullPointerException  |MySec e ){
            System.out.println("Here: " + e);
        }finally {
            System.out.println("FINAL");
        }


    }



}
