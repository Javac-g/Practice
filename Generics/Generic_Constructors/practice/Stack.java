package Generics.Generic_Constructors.practice;

public class Stack<T> {
    Integer stackSize;
    Integer last;
    T[] stck;

     Stack(int stackSize){
         last = -1;
         this.stackSize = stackSize;
         this.stck = (T[]) new Object[stackSize];



     }

     void push(T item){
         if(last == stck.length-1){
             System.out.println("Full stack");
             T[] temp = (T[]) new Object[this.stackSize * 3];
             for (int i = 0; i < stck.length-1;i++){
                 temp[i] = this.stck[i];
             }
         }
         else {

             stck[++last] = item;
         }
     }
     T  pop(){
         if(last < 0){
             System.out.println("Empty stack");

         }
         return stck[last--];



     }

}
