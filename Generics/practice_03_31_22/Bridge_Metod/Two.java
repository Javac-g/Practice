package Generics.practice_03_31_22.Bridge_Metod;

public class Two<T> extends One<String> {

    Two(String object){

        super(object);
    }

    String getObject(){

        System.out.print("String: ");
        return object;

    }
}
