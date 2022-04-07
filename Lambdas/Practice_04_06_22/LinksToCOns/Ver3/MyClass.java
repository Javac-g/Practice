package Lambdas.Practice_04_06_22.LinksToCOns.Ver3;

public class MyClass<T> {
    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public MyClass() {
        val = null;
    }
    T getVal(){
        return val;
    }
}
