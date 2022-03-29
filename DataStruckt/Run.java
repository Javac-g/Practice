package DataStruckt;

public class Run {
    public static void main(String...args){

        StackOne one = new StackOne(15);

        for (int i = 0 ; i < 15; i++)one.push(i);
        System.out.println("Stack have: ");
        for(int i = 0; i < 15;i++) {
            System.out.print(one.pop() + " ");
        }

    }

}
