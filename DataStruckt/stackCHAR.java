package DataStruckt;

public class stackCHAR {

    private int LN;
    private char[] sttc;


    stackCHAR(int size){

        LN = -1;
        sttc = new char[size];

    }

    void push(char item){

        if(LN == sttc.length-1){

            char[] temp = new char[ sttc.length * 3 ] ;

            for (int i = 0; i < sttc.length-1;i++){

                temp[i] = sttc[i];

            }

            sttc = temp;

        }
        else{

            sttc[++LN] = item;

        }
    }

    char pop(){
        if(LN < 0){

            System.out.println("EMPTY STACK");

            return 0;

        }
        else{
            return sttc[LN--];
        }

    }
}
