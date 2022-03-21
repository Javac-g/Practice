package DataStruckt;

public class stack  {

    private Integer Last;
    private Integer[] myStack;

    stack(Integer size){
        Last = -1;
        myStack = new Integer[size];
    }

    void push(Integer item){
        if(Last == myStack.length-1){
            System.out.println("FULL Stack ");
            System.out.println("Stack size changed X3");
            Integer[] temp = new Integer[myStack.length*3];
            for(int i = 0 ; i < myStack.length  ; i++){
                temp[i] = myStack[i];
            }
            myStack = temp;
        }
        else {
            myStack[++Last] = item;
        }
    }

    Integer pop(){
        if(Last < 0){
            System.out.println("Empty DataStruckt.stack");
            return 0;
        }
        else {
            return myStack[Last--];
        }
    }

}
 class Runner{

    public static void main(String...args){

        stack myint = new stack(12);

        for (Integer i = 0; i < 14; i++ )myint.push(i);
        System.out.println("STACK HAVE: ");
        for(Integer i = 0; i < 12; i++){
            System.out.print(myint.pop() + "  ");
        }

    }
}
