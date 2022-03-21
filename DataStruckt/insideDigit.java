package DataStruckt;

public class insideDigit implements Runnable {
    stackNUM number;
    String name;
    Thread t;
    insideDigit(stackNUM number,String name){
        t = new Thread(this,name);
        System.out.println(name + " created: " + this);
        this.number = number;
        this.name = name;

        t.start();
    }

    synchronized public void run(){

        for(int i = 0; i < 12;i++){
           try{

               System.out.println(name+ number.pop() );
               Thread.sleep(1000);

           }catch (InterruptedException e){
               System.out.println("Interrupted");
           }


        }
        System.out.println("END NUMBERS");
    }
}
