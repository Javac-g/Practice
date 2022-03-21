package Exceptions;

public class MySec extends Exception {
    private boolean yes;

    MySec(boolean isHERE){
        yes = isHERE;

    }

    public String toString(){
        return "I am at right place? -- : " + yes;
    }
}
