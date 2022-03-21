package Exceptions;

public class MyExc extends Exception {
    private  int numb;

    MyExc(int a){
        numb = a;
    }

    public String toString(){
        return "My exception: [" + numb + "]";
    }


}
