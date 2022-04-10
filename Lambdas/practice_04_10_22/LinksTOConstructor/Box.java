package Lambdas.practice_04_10_22.LinksTOConstructor;

public class Box {

    private Integer height;
    private Integer weight;
    private Integer length;

    Box(int height,int weight,int length){

        this.height = height;
        this.weight = weight;
        this.length = length;

    }

    Box(){
        height = -1;
        weight = -1;
        length = -1;
    }

    Box(int size){

        height = size;
        weight = size;
        length = size;

    }
    Box(Box object){

        height = object.getHeight();
        weight = object.getWeight();
        length = object.getLength();

    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
