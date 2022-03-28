package Generics.practice_03_27_22;

public class Raun {
    static void showXY(coordinate<?> c){

        for(int i = 0; i < c.coord.length; i++){

            System.out.println("X: " + c.coord[i].x);
            System.out.println("Y: " + c.coord[i].y);

        }
    }
    static void showXYZ(coordinate<? extends THREEd> c){
        for (int i = 0; i < c.coord.length;i++){
            System.out.println("X: " + c.coord[i].x);
            System.out.println("Y: " + c.coord[i].y);
            System.out.println("Z: " + c.coord[i].z);
        }
    }

    static void showALL(coordinate<? extends FOURd> c){
        for (int i = 0; i < c.coord.length;i++){
            System.out.println("X: " + c.coord[i].x);
            System.out.println("Y: " + c.coord[i].y);
            System.out.println("Z: " + c.coord[i].z);
            System.out.println("T: " + c.coord[i].t);
        }
    }

    public static void main(String...args){

        TWOd[] td = {

                new TWOd(0 , 0),
                new TWOd(7 , 9),
                new TWOd(18 , 4),
                new TWOd(-1,-23)

        };

        coordinate<TWOd> tdlock = new coordinate<>(td);

        showXY(tdlock);

        FOURd[] fd = {

                new FOURd(1,3,4,1),
                new FOURd(5,3,75,6),
                new FOURd(15,62,64,85),
                new FOURd(999,24,65,71)

        };

        coordinate<FOURd> fdlock = new coordinate<>(fd);
        showXY(fdlock);
        showXYZ(fdlock);
        showALL(fdlock);
    }

}
