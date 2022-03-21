package DataStruckt;

public class stackNUM {

    private int LN;

    private int[] stck;

    public stackNUM(int size){
        LN = -1;
        stck = new int[size];
    }

    void push(int item){

        if (LN == stck.length-1){

            int[] temp = new int[stck.length*3];

            for (int i = 0; i < stck.length;i++){

                temp[i] = stck[i];

            }

            stck = temp;

        }
        else {

            stck[++LN] = item;

        }
    }

    int pop(){

        if(LN < 0){

            System.out.println("\t\t\tEMPTY STACK");

            return 0;

        }

        else{

            return stck[LN--];

        }

    }
}
