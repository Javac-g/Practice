package Lambdas.practice_04_04_22.Exemplar_Metod_Catch.Var3;

public class Main {

    static <T> int counter(T [] values,Temrature<T> tem,T t){

        int count = 0;
        for(int i = 0; i < values.length;i++){
            if(tem.func(values[i],t))count++;
        }
        return count;
    }

    public static void main(String...args){
        int count;
        High_temp[] daystemp = {new High_temp(15),new High_temp(25),
                                new High_temp(4),new High_temp(45),
                                new High_temp(24),new High_temp(35)};

        count = counter(daystemp,High_temp::Same_Temp,new High_temp(40));
        System.out.println("days with temp = 40: " + count);

        count = counter(daystemp,High_temp::Less_Temp,new High_temp(30));
        System.out.println("days with temp less than 30: " + count);

        count = counter(daystemp,High_temp::Hotter_Temp,new High_temp(30));
        System.out.println("days with temp more than 30: " + count);

    }
}
