package Lambdas.practice_04_07_22;

public class Box {
    private int length;
    private int heigt;
    private int weight;

    Box(){
        length = 0;
        heigt = 0;
        weight = 0;
    }

    Box(int length, int heigt, int weight){

        this.length = length;
        this.heigt = heigt;
        this.weight = weight;

    }

    Box(int s){
        length = s;
        heigt = s;
        weight = s;
    }

    Box(Box ob){

        length = ob.getLength();
        weight = ob.getWeight();
        heigt = ob.getHeigt();

    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeigt() {
        return heigt;
    }

    public void setHeigt(int heigt) {
        this.heigt = heigt;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
