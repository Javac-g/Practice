package Lambdas.practice_04_07_22;

public class Main_Two {
    static <R ,T> R factory(Toool<R,T> tool,T t1,T t2, T t3){
        return tool.mybox(t1,t2,t3);
    }
    public static void main(String...args){
        Tool box = Box ::new;
        Box F = box.function(12);

        System.out.println(F.getHeigt());
        System.out.println(F.getLength());
        System.out.println(F.getWeight());

        Toool<Box_Two<Integer>,Integer> toolOne = Box_Two :: new;
        Toool<Box_Two<String>,String>  toolTwo = Box_Two::new;

        Box_Two<Integer> one = toolOne.mybox(12, 14 ,15);
        Box_Two<String> two = toolTwo.mybox("one","two","three");

        Box_Two<Integer> three = factory(toolOne,22,33,44);


        System.out.println(one.getHeight());
        System.out.println(two.getHeight());






    }
}
