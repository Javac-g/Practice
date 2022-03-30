package Generics.practice_03_30_22;

public class App {

    static void show_XY(Map<? extends XY> object){

        for (int i = 0; i < object.coordinates.length; i++){

            System.out.print(object.coordinates[i].x + " " );

            System.out.print(object.coordinates[i].y + " ");
        }
        System.out.println("X Y coordinates");
    }

    static void show_XYZ(Map<? extends XYZ> object){

        for (int i = 0; i <object.coordinates.length; i++ ){
            System.out.print(object.coordinates[i].x + " ");

            System.out.print(object.coordinates[i].y + " ");

            System.out.print(object.coordinates[i].z + " ");
        }
        System.out.println("X Y Z coordinates");
    }

    static void show_XYZT(Map<? extends XYZT> object){
        for (int i = 0 ; i < object.coordinates.length;i++){

            System.out.print(object.coordinates[i].x + " ");

            System.out.print(object.coordinates[i].y + " ");

            System.out.print(object.coordinates[i].z + " ");

            System.out.print(object.coordinates[i].t + " ");
        }

        System.out.println("X Y Z T coordinates");
    }

    public static void main(String...args){
        XY[] two = {
                new XY(1,1),
                new XY(2,2),
                new XY(3,3)
        } ;

        XYZ[] three = {
                new XYZ(1,1,1),
                new XYZ(2,2,2),
                new XYZ(3,3,3)
        };

        XYZT[] four = {

                new XYZT(1,1,1,1),
                new XYZT(2,2,2,2),
                new XYZT(3,3,3,3)
        };

        // place our arrays with objects in object

        Map<XY> twoD = new Map<XY>(two);
        Map<XYZ>threeD = new Map<XYZ>(three);
        Map<XYZT>fourD = new Map<XYZT>(four);

        //applying our methods

        show_XY(twoD);
        show_XYZ(threeD);
        show_XYZT(fourD);


    }
}
