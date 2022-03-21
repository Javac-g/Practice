package DataStruckt;

public class insideBOOL implements Runnable{
    stackBOOL bool;
    String name;
    Thread t;
    insideBOOL(stackBOOL bool,String name){
        t = new Thread(this,name);
        System.out.println(name + " created: " + this);
        this.bool = bool;
        this.name = name;
        t.start();
    }

    synchronized public void run(){

        for(int i = 0; i < 12;i++){
            try{

                System.out.println(name+bool.pop() );
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        System.out.println("END BOOLEAN");
    }
}
