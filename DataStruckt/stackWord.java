package DataStruckt;

public class stackWord {
    private int LN;
    private String[] stcc;

    stackWord(int size){
        LN = -1;
        stcc = new String[size];
    }

    void push(String item){
        if(LN == stcc.length-1){

            String[] temp = new String[stcc.length*3];

            for(int i = 0; i < stcc.length; i++){

                temp[i] = stcc[i];

            }

            stcc = temp;
        }
        else{

            stcc[++LN] = item;

        }
    }

    String pop(){

        if(LN < 0){

            System.out.println("EMPTY STACK");

            return "0";
        }

        else {

            return stcc[LN--];

        }
    }
}
