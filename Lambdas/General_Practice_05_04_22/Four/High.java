package Lambdas.General_Practice_05_04_22.Four;

public class High {
    int Htemp = 35;

    High(int Htemp){
        this.Htemp = Htemp;
    }

    boolean isSame(High obj){
        return Htemp == obj.Htemp;
    }
    boolean Higer(High obj){

        return  Htemp < obj.Htemp;
    }
}
