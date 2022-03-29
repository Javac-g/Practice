package DataStruckt;

public class StackOne {
    private Integer[] stck;
    private Integer L;

    StackOne(Integer size){

        L = -1;
        stck = new Integer[size];

    }

    void push(Integer item){
        if(L == stck.length -1){
            System.out.println("Full stack -- Stack will be increased by 3 ");
            Integer[] temp = new Integer[ stck.length * 3 ];
            for (int i = 0; i < stck.length-1;i++){
                temp[i] = stck[i];
            }
            stck = temp;
        }
        else{
            stck[++L] = item;
        }

    }

    Integer pop(){
        if(L < 0){
            System.out.println("EMPTY STACK");
            return 0;
        }
        else {
            return stck[L--];
        }
    }
}
