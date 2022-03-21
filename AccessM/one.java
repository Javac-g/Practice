package AccessM;

public class one {

    transient int a = 46;
    protected int b;
    static int c;
    final int d = 45;
    volatile int f;


    public static void main(String...args){

        two ob = new two();
        System.out.println(ob instanceof two);


    }

}
