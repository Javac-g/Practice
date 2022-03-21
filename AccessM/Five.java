package AccessM;

public class Five {

    static int val = 3;
    static int getnum(){
        return val--;
    }
    public static void main(String...args){
       int n = 0;

       for(int c = 0; c < 10 ; c++ ){
           assert (n = getnum()) > 0;
           System.out.println("N: " + n);
       }



    }


}
