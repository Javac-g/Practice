package Generics.practice_03_24_22;

public class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] coords){
        this.coords = coords;
    }

    static void showXY(Coords<?>c){
        for(int i = 0; i < c.coords.length; i++){
            System.out.printf( "%XdY%d",c.coords[i].x, c.coords[i].y);
        }
        System.out.println();
    }
}
