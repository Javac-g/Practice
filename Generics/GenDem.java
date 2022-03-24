package Generics;

public class GenDem {
    public static void main(String...args){
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.showType();

        int v = iob.getOb();
        System.out.println("V: " + v);


        Gen<String> sob = new Gen<String>("Hello Markes");
        sob.showType();
        String str = sob.getOb();
        System.out.println("str: " + str);




    }

}
