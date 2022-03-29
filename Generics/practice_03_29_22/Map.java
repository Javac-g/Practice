package Generics.practice_03_29_22;

public class Map<T extends twoD> {

    T[] coordinates;

    Map(T[] coordinates){

        this.coordinates = coordinates;

    }
}
