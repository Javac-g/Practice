package Native;

public class One {
    private int i;
    public static void  main(String...args){
        One ob = new One();
        ob.i = 10;

        System.out.println(ob.i);
        ob.test();
        System.out.println(ob.i);

    }
    public native void test();

    static {
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("One");
    }
}
