package Lambdas.General_Practice_05_04_22.Four;

public class One {

    static <T> int runner(Tool<T> tool,T[] values, T t){
        int count = 0;
        for (int i = 0 ; i < values.length; i++){
            if(tool.function(values[i],t))count++;
        }
        return count;
    }

    public static void main(String...args){
        High[] days = {new High(23),new High(56),new High(35)};
        System.out.println("days with temp 35: "+ runner(High::isSame,days,new High(35)));
    }


}
