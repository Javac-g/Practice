package Lambdas.practice_04_03_22.Ver5;

import java.util.Random;

public class Main {
    public static void main(String...args)throws MyExeption{
        Tool one = (num) -> {
            if(num > 5) {
                throw new MyExeption("My exception message");
            }
            return 404;
        };

        System.out.println(one.isPrime(77));


    }
}
