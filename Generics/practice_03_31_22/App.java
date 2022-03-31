package Generics.practice_03_31_22;

public class App {


    static void show_XY(Map<? extends two> object){
        for (int i = 0; i < object.parameter.length; i++){

            System.out.print(object.parameter[i].x + ":X ");
            System.out.print(object.parameter[i].y + ":Y ");

        }
        System.out.println("Parameters of [X ,Y]");
    };

    static void show_XYZ(Map<? extends three> object){
        for (int i = 0; i < object.parameter.length; i++){

            System.out.print(object.parameter[i].x + ":X ");
            System.out.print(object.parameter[i].y + ":Y ");
            System.out.print(object.parameter[i].z + ":Z ");

        }
        System.out.println("Parameters of [X ,Y, Z]");
    }
    static void show_XYZT(Map<?extends four>object){
        for (int i = 0; i < object.parameter.length; i++){

            System.out.print(object.parameter[i].x + ":X ");
            System.out.print(object.parameter[i].y + ":Y ");
            System.out.print(object.parameter[i].z + ":Z ");
            System.out.print(object.parameter[i].t + ":T ");

        }
        System.out.println("Parameters of [X ,Y, Z, T]");

    }

    public static void main(String...args){

        two[] xy ={new two(1,2),new two(3,4),new two(5,6)};
        three[] xyz ={new three(1,2,3),new three(4,5,6),new three(7,8,9)};
        four[] xyzt ={new four(1,2,3,4),new four(5,6,7,8),new four(9,10,11,12)};

        Map<two> D2 = new Map<>(xy);
        Map<three> D3 = new Map<>(xyz);
        Map<four> D4 = new Map<>(xyzt);

        show_XY(D2);
        show_XYZ(D3);
        show_XYZT(D4);



    }



}
