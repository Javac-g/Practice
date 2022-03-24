package Exceptions;

public class MyEX extends Throwable {
    String name;

    MyEX(String name){
        this.name=name;
    }

    public String toString(){
        return "Error: " + name;
    }
}
