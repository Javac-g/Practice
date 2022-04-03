package Lambdas.Exception;

public class Main {
    public static void main(String...args) throws EmptyArrayException{
        Integer[] values = {2,10};
        Tool one =  (array) ->{
            Integer sum = 0;

            if(array.length == 0){
                throw new EmptyArrayException();
            }
            for(int i = 0 ; i < array.length;i++){
                sum += array[i];
            }
            return sum / array.length;
        };
        System.out.println("Average: " + one.func(values));
    }
}
