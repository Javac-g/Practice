package Lambdas.practice_04_10_22.LinksTOConstructor.V2;

public class Cube<T> {

    private T length;
    private T height;
    private T weight;

    public Cube(T length, T height, T weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
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

    public void setHeight(T height) {
        this.height = height;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
    static void show(Cube object){
        System.out.println("Height: " + object.getHeight());
        System.out.println("Weight: " + object.getWeight());
        System.out.println("Length: " + object.getLength());
    }
}
