package Lambdas.practice_04_07_22;

public class Box_Two<T> {

   private T length;
   private T height;
   private T weight;

    Box_Two(T length,T height,T weight){

        this.height = height;
        this.length = length;
        this.weight = weight;

    }
    Box_Two(T t){

        height = t;
        length = t;
        weight = t;

    }

    Box_Two(){

        height = null;
        weight = null;
        length = null;

    }

    Box_Two(Box_Two<T> box){

        this.length = box.getLength();
        this.weight = box.getWeight();
        this.height = box.getHeight();

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
}
