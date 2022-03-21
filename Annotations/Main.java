package Annotations;

import Enums.Grades;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnno{
    String str() default "Hello";
    int val() default 9000;
}


@interface MyMarker{}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description() default "Annotations.What annotation";
}


@What(description = "test class annotation")
@myAnno(str = "Annotations.Meta",val = 99)
class Meta{

    @What(description = "test metod annotation")
    @myAnno(str = "Testing", val = 100)
    @MyMarker
    public static void myOO(){
        Meta ob = new Meta();
        try{
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("ALL META CLASS ANNOTATIONS:");
            for(Annotation a: annos){
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myOO");
            annos = m.getAnnotations();
            System.out.println("All annotations myOO method: ");
            for(Annotation a: annos){
                System.out.println(a);
            }
        }catch(NoSuchMethodException exc){
            System.out.println("Metod not found: "+ exc);
        }
    }
}
public class Main {
    @myAnno(str="My age  ",val = 26)
    public static void obe(String str,Integer i){
        Main ob = new Main();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("obe",String.class,Integer.class  );
            myAnno anno = m.getAnnotation(myAnno.class);
            System.out.println(anno.str() + str + (i+anno.val()));
        }catch(NoSuchMethodException exc){
            System.out.println("Metod not found: " + exc);
        }

    }
    public static void main(String...args){
        Meta.myOO();
        Grades grades;
        grades = Grades.PERFECT;

    }
}
