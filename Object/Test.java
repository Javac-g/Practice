package Object;

public class Test<T> {
    private String secret = "I AM DEVELOPER";
    T ob;

    Test(T ob){
        this.ob = ob;
    }

    T getOb(){

        return ob;

    }
    String getSecret(){
        return secret;
    }
}
