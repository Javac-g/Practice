package Generics.practice_03_29_22;

public class App {
    static void showXY(Map<? extends twoD> Object){
        for (int i = 0 ; i < Object.coordinates.length;i++){
            System.out.print(Object.coordinates[i].x + " ");
            System.out.print(Object.coordinates[i].y + " ");
        }
        System.out.println("X Y");
    }

    static void showXYZ(Map<? extends threeD> Object){
        for (int i = 0 ; i < Object.coordinates.length;i++){
            System.out.print(Object.coordinates[i].x + " ");
            System.out.print(Object.coordinates[i].y + " ");
            System.out.print(Object.coordinates[i].z + " ");

        }
        System.out.println("X Y Z");
    }
    static void showALL(Map<? extends fourD> Object){
        for (int i = 0 ; i < Object.coordinates.length;i++){
            System.out.print(Object.coordinates[i].x + " ");
            System.out.print(Object.coordinates[i].y + " ");
            System.out.print(Object.coordinates[i].z + " ");
            System.out.print(Object.coordinates[i].t + " ");
        }
        System.out.println("X Y Z T");
    }

    public static void main(String...args){

        twoD[] twd = {
        new twoD(1,2),
        new twoD(3,4),
        new twoD(5,6)
        };

        threeD[] trd = {
                new threeD(1,2,3),
                new threeD(4,5,6),
                new threeD(7,8,9)
        } ;

        fourD[] fd = {
                new fourD(1,2,3,4),
                new fourD(5,6,7,8),
                new fourD(9,10,11,12)
        };

        Map<twoD> TWOO = new Map<>(twd);

        Map<threeD> THREE = new Map<>(trd);

        Map<fourD> FOUR = new Map<>(fd);

        showXY(TWOO);
        showXYZ(THREE);
        showALL(FOUR);


    }
}
