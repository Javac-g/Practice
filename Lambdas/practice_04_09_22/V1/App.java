package Lambdas.practice_04_09_22.V1;

public class App {

    static void show_XY(Map<? extends XY> object){
        for (int i = 0 ; i < object.coords.length; i++){
            System.out.print(object.coords[i].x + " ");
            System.out.print(object.coords[i].y + " ");
        }
        System.out.println("-- SHOW [X][Y]");
    }

    static void show_XYZ(Map<? extends XYZ> object){
        for (int i = 0 ; i < object.coords.length; i++){
            System.out.print(object.coords[i].x + " ");
            System.out.print(object.coords[i].y + " ");
            System.out.print(object.coords[i].z + " ");
        }
        System.out.println("-- SHOW [X][Y][Z]");
    }

    static void show_XYZT(Map<? extends XYZT> object){
        for (int i = 0 ; i < object.coords.length; i++){
            System.out.print(object.coords[i].x + " ");
            System.out.print(object.coords[i].y + " ");
            System.out.print(object.coords[i].z + " ");
            System.out.print(object.coords[i].t + " ");
        }
        System.out.println("-- SHOW [X][Y][Z][T]");
    }
    public static void main(String...args){

        XY[] xy = {new XY(1,1), new XY(2,2), new XY(3,3)};
        XYZ[] xyz = {new XYZ(1,1,1),new XYZ(2,2,2), new XYZ(3,3,3)};
        XYZT[] xyzt = {new XYZT(1,1,1,1),new XYZT(2,2,2,2), new XYZT(3,3,3,3)};

        Map<XY> twoD = new Map<>(xy);
        Map<XYZ> threeD = new Map<>(xyz);
        Map<XYZT> fourD = new Map<>(xyzt);

        show_XY(twoD);
        show_XYZ(threeD);
        show_XYZT(fourD);





    }



}
