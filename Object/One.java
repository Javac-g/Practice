package Object;

public class One {
    String name = "Markes";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void message(Test<?> K){
        System.out.println(K.getOb());
    }
}
