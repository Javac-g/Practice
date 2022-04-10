package Lambdas.practice_04_10_22.LinksTOConstructor;

public class App {
    static void showOb(Box object){
        System.out.println("Height: " + object.getHeight());
        System.out.println("Weight: " + object.getWeight());
        System.out.println("Length: " + object.getLength());
    }
    public static void main(String...args){

        BoxCon construct = Box::new;
        Box one = construct.function(1,2,3);
        showOb(one);



    }
}
