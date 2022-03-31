package Generics.practice_03_31_22.Interface;

public interface MyTools<T extends Comparable<T>> {

     T min();
     T max();

}
