package Object;

public class Main {
    public static void main(String...args){
        One one = new One();

        Test<One> test = new Test<One>(one);
        System.out.println(test.getOb().getName());
        Integer f = 987;
        Test<Integer> gg = new Test<Integer>(f);
        one.message(gg);



    }
}
