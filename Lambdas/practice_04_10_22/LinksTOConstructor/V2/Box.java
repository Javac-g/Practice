package Lambdas.practice_04_10_22.LinksTOConstructor.V2;

public class Box<T> {

    private T length;
    private T height;
    private T weight;

    Box(){

        length = null;
        height = null;
        weight = null;

    }

    Box(T length, T height, T weight){

        this.length = length;
        this.height = height;
        this.weight = weight;

    }

    Box(T s){
        length = s;
        height = s;
        weight = s;
    }

    Box(Box<T> ob){

        length = ob.getLength();
        weight = ob.getWeight();
        height = ob.getHeight();

    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T heigt) {
        this.height = height;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
    static void show(Box object){
        System.out.println("Height: " + object.getHeight());
        System.out.println("Weight: " + object.getWeight());
        System.out.println("Length: " + object.getLength());
    }
}
