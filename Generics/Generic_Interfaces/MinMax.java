package Generics.Generic_Interfaces;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
