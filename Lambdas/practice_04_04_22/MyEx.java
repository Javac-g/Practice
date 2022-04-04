package Lambdas.practice_04_04_22;

public class MyEx extends Throwable {
    String name;
    MyEx(String name){
        super();
        this.name = name;
    }

    public String toString(){

        return "Found exception: " + name;

    }
}
