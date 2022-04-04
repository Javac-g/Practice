package Lambdas.practice_04_04_22.Exemplar_Metod_Catch.Var2;

public class Main {
   private static <T> int counter(T[] values, Tool<T> f,T t){
        int count = 0;
        for(int i = 0; i < values.length; i++){
            if(f.func(values[i],t))count++;
        }
        return count;
   }
   public static void main(String...args){
        int count;

        High[] weekdays = {new High(89),new High(65),
                           new High(99),new High(71),
                           new High(88),new High(88),
                           new High(87),new High(77)
        };


       count = counter(weekdays,High::same,new High(88));
       System.out.println("T 88 was:  " + count);


       High[] weekdays2 = {new High(32),new High(12),
               new High(24),new High(19),
               new High(18),new High(13),
               new High(-1),new High(12)
       };

       count = counter(weekdays2,High::same,new High(12));
       System.out.println("Days with temp 12: " + count);

       count = counter(weekdays,High::less,new High(89));
       System.out.println("Temp les them 89 was " + count);


    }
}
