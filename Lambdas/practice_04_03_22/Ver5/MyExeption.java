package Lambdas.practice_04_03_22.Ver5;

import Exceptions.MyEX;

public class MyExeption extends Exception {
    String what;

    MyExeption(String what){

        this.what = what;

    }
    public String toString(){
        return what;
    }
}
