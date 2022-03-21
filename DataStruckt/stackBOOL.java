package DataStruckt;

public class stackBOOL {

    private int LN;
    private boolean[] st;

    stackBOOL(int size){
        LN = -1;
        st = new boolean[size];
    }

    void push(boolean item){

        if(LN == st.length-1){

            boolean[] temp = new boolean[st.length * 3];

            for(int i = 0; i < st.length; i++){

                temp[i] = st[i];

            }

            st = temp;

        }
        else {

            st[++LN] = item;

        }
    }

    String pop(){
        if(LN < 0){

            System.out.println("EMPTY STACK");

            return "0";

        }
        else {

            return st[LN--] + " ";
        }
    }




}
