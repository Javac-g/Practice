package Lambdas.General_Practice_05_04_22.One;

public class App {

    static void show_XY(Map<? extends XY> object){
        for(int i = 0; i < object.coordinates.length;i++){

            System.out.print(object.coordinates[i].x + " ");
            System.out.print(object.coordinates[i].y + " ");

        }
        System.out.println("#### XY");
    }

    static void show_XYZ(Map<?extends XYZ> object){
        for(int i = 0; i < object.coordinates.length;i++){

            System.out.print(object.coordinates[i].x + " ");
            System.out.print(object.coordinates[i].y + " ");
            System.out.print(object.coordinates[i].z + " ");

        }
        System.out.println("#### XYZ");
    }
    static void show_XYZT(Map<?extends XYZT> object){
        for(int i = 0; i < object.coordinates.length;i++){

            System.out.print(object.coordinates[i].x + " ");
            System.out.print(object.coordinates[i].y + " ");
            System.out.print(object.coordinates[i].z + " ");
            System.out.print(object.coordinates[i].t + " ");

        }
        System.out.println("#### XYZT");
    }

    public static void main(String...args){

        XY[] TwoC ={new XY(12,24),new XY(32,33),new XY(15,42)};
        XYZ[] ThreeC = {new XYZ(1,2,3),new XYZ(99,88,77),new XYZ(4,5,6)};
        XYZT[] fourC = {new XYZT(11,22,33,44),new XYZT(111,222,333,444)};

        Map<XY> seconD = new Map<>(TwoC);
        Map<XYZ> thirdD = new Map<>(ThreeC);
        Map<XYZT> fourD = new Map<>(fourC);

        show_XY(seconD);
        show_XYZ(thirdD);
        show_XYZT(fourD);


    }
}
