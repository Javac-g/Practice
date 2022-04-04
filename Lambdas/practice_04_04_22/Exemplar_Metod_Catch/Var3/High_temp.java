package Lambdas.practice_04_04_22.Exemplar_Metod_Catch.Var3;

public class High_temp {
    int high_value;

    High_temp(int high_value){

        this.high_value = high_value;

    }

    boolean Same_Temp(High_temp object){

        return high_value == object.high_value;
    }

    boolean Less_Temp(High_temp object){
        return high_value < object.high_value;
    }

    boolean Hotter_Temp(High_temp object){

        return high_value > object.high_value;

    }
}
