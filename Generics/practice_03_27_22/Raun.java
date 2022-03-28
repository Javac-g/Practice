package Generics.practice_03_27_22;

public class Raun {
    static void showXY(coordinate<?> object){

        for(int i = 0; i < object.ArrayWithCoord.length; i++){


            System.out.print(object.ArrayWithCoord[i].x + " ");

            System.out.print(object.ArrayWithCoord[i].y + " ");

        }
        System.out.println("COORDINATES : X Y ");
    }
    static void showXYZ(coordinate<? extends THREEd> object){

        for (int i = 0; i < object.ArrayWithCoord.length;i++){


            System.out.print(object.ArrayWithCoord[i].x + " ");

            System.out.print(object.ArrayWithCoord[i].y + " ");

            System.out.print(object.ArrayWithCoord[i].z + " ");

        }
        System.out.println("COORDINATES : X Y Z");
    }

    static void showALL(coordinate<? extends FOURd> object){

        for (int i = 0; i < object.ArrayWithCoord.length;i++){

            System.out.print(object.ArrayWithCoord[i].x + " ");

            System.out.print(object.ArrayWithCoord[i].y + " ");

            System.out.print(object.ArrayWithCoord[i].z + " ");

            System.out.print(object.ArrayWithCoord[i].t + " ");
        }
        System.out.println("COORDINATES : X Y Z T");
    }

    public static void main(String...args){

        TWOd[] twodObjectsArray = {
            //puts Object.x, Object.y to twodObjectsArray
                new TWOd(0 , 0),
                new TWOd(7 , 9),
                new TWOd(18 , 4),
                new TWOd(-1,-23)

        };

        coordinate<TWOd> twoDimesionOb = new coordinate<>(twodObjectsArray);



        FOURd[] fourdObjectsArray = {

                new FOURd(1,3,4,1),
                new FOURd(5,3,75,6),
                new FOURd(15,62,64,85),
                new FOURd(999,24,65,71)

        };

        coordinate<FOURd> fourDimensionOb = new coordinate<>(fourdObjectsArray);
        showXY(fourDimensionOb);
        showXYZ(fourDimensionOb);
        showALL(fourDimensionOb);
    }

}
