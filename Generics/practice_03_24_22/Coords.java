package Generics.practice_03_24_22;

public class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] coords){
        this.coords = coords;
    }
}
