package Generics.Generic_Constructors;

public class Main {

    public static void main(String...args){
        One one = new One(123);
        One two = new One(22.4);
        One three = new One(1.5F);

        one.show();
        two.show();
        three.show();

    }
}
