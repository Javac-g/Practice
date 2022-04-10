package Lambdas.practice_04_10_22.LinksTOConstructor.V2;

public class App {

    static <T,V> T factory(BoxCon<T,V> constr,V v1,V v2, V v3){

        return constr.function(v1,v2,v3);

    }
    public static void main(String...args){

        BoxCon<Box<Integer>,Integer> boxI = Box::new;
        BoxCon<Box<String>,String> boxS = Box::new;

        BoxCon<Cube<String>,String> cubeS = Cube::new;
        BoxCon<Cube<Integer>,Integer> cubeI = Cube::new;

        Box box1 = factory(boxI,12,12,12);
        Box box2 = factory(boxS,"one","two" , "three");

        Cube cube1 = factory(cubeI,1,1,1);
        Cube cube2 = factory(cubeS,"four","five","six");

        Box.show(box1);
        Box.show(box2);
        Cube.show(cube1);
        Cube.show(cube2);


    }
}
