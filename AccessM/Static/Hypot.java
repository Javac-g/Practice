package AccessM.Static;
import static java.lang.Math.*;
import static java.lang.System.out;

public class Hypot {
    public static void main(String...args){
        double sideOne,sideTwo,hypot;

        sideOne = 3.0;
        sideTwo = 4.0;

        hypot = sqrt(pow(sideOne,2)+pow(sideTwo,2));

        out.println("HYPOTHENUSE:  " + hypot);




    }
}
