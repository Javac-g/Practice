package Exceptions;

public class Three {
    static void One()throws MyEX  {
        throw new MyEX("OUT OF MIND");
    }
    public static void main(String...args) throws MyEX {
        try {
            One();
        }catch (MyEX e){
            System.out.println("ITS YOUR FIST ERR: "+ e);
        }
    }
}
